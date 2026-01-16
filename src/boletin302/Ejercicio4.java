package boletin302;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 16/1/26
 */
/*Ejercicio 4. Se desea gestionar las notas de estudiantes de un curso mediante matrices en Java. El ejercicio consiste en almacenar las notas de varios estudiantes en diferentes módulos.

Primero se indicará el número de estudiantes.
A continuación se indicará el número de módulos.
A continuación se añadirán las notas de cada estudiante módulo a módulo.
Una vez introducidas las notas del alumnado se mostrará el siguiente menú utilizando la estructura switch:
a) Media de un alumno/a: se pedirá el índice del alumno y se calculará la media de sus notas.
b) Porcentaje de aprobados: se calculará el porcentaje de aprobados del módulo del que se introduzca el índice.*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el numero de estudiantes: ");
        int estudiantes = entrada.nextInt();
        System.out.print("Ingrese el numero de modulos: ");
        int modulos = entrada.nextInt();
        int [][] matriz = new int[estudiantes][modulos];
        rellenarDatos(estudiantes, modulos, entrada, matriz);

        //Funciones

    }
    private static void rellenarDatos (int estudiantes, int modulos, Scanner entrada, int [][] matriz){
        for (int c = 0 ; c < estudiantes ; c++ ){
            for (int f = 0 ; f < modulos ; f++ ){
                System.out.printf("Introduce la nota del modulo %d : ", c);
                matriz[f][c] = entrada.nextInt();
            }
        }
    }

}
