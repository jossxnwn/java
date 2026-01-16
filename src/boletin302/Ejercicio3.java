package boletin302;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 15/1/26
 */
/*Ejercicio 3. Crea un programa en Java que realice las siguientes acciones:

Crea una matriz (array bidimensional). El usuario introducirá el número de columnas y filas en ese orden.
A continuación, introducirá los valores columna a columna.
Calcula el valor de la suma de cada columna. Imprime esos valores en orden con System.out.println en orden.
Calcula el valor de la suma de cada fila. Imprime esos valores en orden con System.out.println en orden.*/
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce número de COLUMNAS: ");
        int totalColumnas = entrada.nextInt();
        System.out.print("Introduce número de FILAS: ");
        int totalFilas = entrada.nextInt();
        int[][] matriz = new int[totalFilas][totalColumnas];
        System.out.println("--- Rellenando la matriz COLUMNA a COLUMNA ---");
        int fila = 0;
        int resultadoFila = 0;
        int resultadoColumna = 0;
        rellenarDatos(totalFilas, totalColumnas, matriz, entrada);
        mostrarPorPantalla(totalFilas, totalColumnas, matriz);


//        int[][] arrayprueba = {
//            {2,3,4,5}, // 14
//            {4,7,8,9},
//            {9,4,5,7}
//        };
//
//        matriz = arrayprueba;
//        totalFilas = 3;
//        totalColumnas = 4;


        // Sumar los valores de cada columna
        // Recorrido por columna

        sumarValoresColumnas(totalFilas, totalColumnas, resultadoFila, matriz, resultadoColumna);

        // Sumar los valores de cada fila
        // Recorrido por fila

        sumarValoresFilas(totalFilas,totalColumnas, resultadoFila, matriz);
    }

    //Funciones
    public static void sumarValoresFilas(int totalFilas, int totalColumnas, int resultadoFila, int [][] matriz) {
        for (int f = 0 ; f < totalFilas ; f ++){
            for (int c = 0 ; c < totalColumnas ; c++){
                resultadoFila = resultadoFila + matriz[f][c];
            }
            System.out.printf("Fila %d vale : %d\n", f +1 , resultadoFila);
            resultadoFila = 0;
        }
    }

    public static void sumarValoresColumnas(int totalFilas, int totalColumnas, int resultadoFila, int [][] matriz, int resultadoColumna) {
        for (int c = 0; c < totalColumnas ; c++) {
            for (int f = 0 ; f < totalFilas ; f++){
                resultadoColumna = resultadoColumna + matriz[f][c];
            }
            System.out.printf("Columna %d vale : %d\n", c + 1 , resultadoColumna);
            resultadoColumna = 0;
        }
    }

    public static void rellenarDatos(int totalFilas, int totalColumnas, int[][] matriz, Scanner entrada) {
        // Rellenar array con valores
        // Recorrido por columnas
        for (int c = 0; c < totalColumnas ; c++) {       // Bucle para COLUMNAS
            for (int f = 0; f < totalFilas ; f++) {   // Bucle para FILAS
                System.out.printf("Posición Fila %d, Columna %d: ", f, c);
                matriz[f][c] = entrada.nextInt();
            }
        }
    }

    public static void mostrarPorPantalla(int totalFilas, int totalColumnas, int[][] matriz) {
        // Mostrando por pantalla el array
        // Recorrido por filas
        for (int f = 0; f < totalFilas; f++) {
            for(int c = 0; c< totalColumnas ; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }

    }
}
