package boletin302;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 22/1/26
 */
/*Ejercicio 5. Crea el juego Tres en raya en Java utilizando una matriz (array bidimensional) para representar el tablero de juego. El programa debe permitir que dos jugadores humanos jueguen entre ellos alternando turnos hasta que uno de ellos consiga ganar o que el tablero quede completo, resultando en un empate.

Utiliza una matriz de tamaño 3x3 de enteros para representar el tablero.
Inicialmente, cada posición del tablero debe estar vacía, representada con un 0 en el array.
Alterna entre los dos jugadores, representados por los números 1 y 2.
Muestra el tablero después de cada movimiento. Los espacios vacíos se representan con - y los jugadores con X para el jugador 1 y O para el jugador 2.
Verifica y muestra un mensaje cuando un jugador gana o si hay un empate si se han llenado todos los huecos.*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //Sacar a entrada de Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Elemento decorativo
        System.out.println("|---Tres en raya---|");

        //Definir matriz;
        int[][] matriz = new int[4][4];
        int jugada = 0;
 
        //Mostrar la matriz+
        mostrarTresEnRaya(matriz);

        //Mostrar el primer turno
        System.out.println("Ingrese el primer turno");
        int turno = entrada.nextInt();

        while (true) {
            ingresarPosicion(entrada, matriz, turno);
            mostrarTresEnRaya(matriz);
            jugada += 1;
            if (comprobarGanador(matriz)){
                if (turno == 1) {
                    System.out.println("Gano X");
                    break;
                }else if (turno == 2){
                    System.out.println("Gano O");
                    break;
                }
            }
            if (jugada >=9){
                System.out.println("\n JUEGO TERMINADO EMPATE");
                break;
            }
            switch (turno) {
            case 1:
                turno = 2;                
                break;
            case 2:
                turno = 1;                
                break;
            }
        }

    }
    //Funciones
    public static void mostrarTresEnRaya(int[][] matriz){
        for (int c = 0 ; c < 4 ; c++){
            for (int f = 0 ; f < 4 ; f++){
                if (c == 0) {
                    System.out.printf("C%d", f);
                }else if (f == 0) {
                    System.out.printf("F%d", c);
                }else{
                    switch (matriz[c][f]) {
                        case 0:
                            System.out.print("-");
                            break;
                        case 1:
                            System.out.print("X");
                            break;
                        case 2:
                            System.out.print("O");
                            break;
                    }
                }
                System.out.print("\t");
            } 
            System.out.println();
        }
        System.out.println("|------------------|");
    }
    public static void ingresarPosicion(Scanner entrada, int[][] matriz, int turno){
        //Ingresar posicion en la fila y columna
        System.out.println("Ingresa la columna: ");
        int columna = entrada.nextInt();
        System.out.println("Ingresa la fila : ");
        int fila = entrada.nextInt();
        for(int c = 0; c < 4 ; c++){
            for (int f = 0 ; f < 4 ; f++){
                if (columna == c && fila == f) {
                    matriz[f][c] = turno;
                }
            }
        }

        //Recorrer para introducir los valores
    }
    public static boolean comprobarGanador(int[][] matriz) {
    // IMPORTANTE: Como usas matriz 4x4, tus datos van del 1 al 3.
    // Ignoramos el índice 0.

    // 1. Comprobar FILAS (Horizontal)
        for (int f = 1; f <= 3; f++) {
            // Si la celda no es 0 Y es igual a la siguiente Y igual a la tercera
            if (matriz[f][1] != 0 && matriz[f][1] == matriz[f][2] && matriz[f][2] == matriz[f][3]) {
                return true; // Hay un ganador en la fila f
            }
        }

        // 2. Comprobar COLUMNAS (Vertical)
        for (int c = 1; c <= 3; c++) {
            if (matriz[1][c] != 0 && matriz[1][c] == matriz[2][c] && matriz[2][c] == matriz[3][c]) {
                return true; // Hay un ganador en la columna c
            }
        }

        // 3. Comprobar DIAGONAL (Izquierda a Derecha)
        // Posiciones: [1][1], [2][2], [3][3]
        if (matriz[1][1] != 0 && matriz[1][1] == matriz[2][2] && matriz[2][2] == matriz[3][3]) {
            return true;
        }

        // 4. Comprobar DIAGONAL INVERSA (Derecha a Izquierda)
        // Posiciones: [1][3], [2][2], [3][1]
        if (matriz[1][3] != 0 && matriz[1][3] == matriz[2][2] && matriz[2][2] == matriz[3][1]) {
            return true;
        }

        // Si no ha pasado nada de lo anterior, nadie ha ganado aún
        return false;
}
}
