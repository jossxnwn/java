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
        //Asignar variable a scanner
        Scanner entrada = new Scanner(System.in);

        //Lectura de variables
        System.out.print("Ingresa el numero de estudiantes: ");
        int estudiantes = entrada.nextInt();
        System.out.print("Ingrese el numero de modulos: ");
        int modulos = entrada.nextInt();

        //Creacion de matriz con valores
        double [][] matriz = new double[estudiantes][modulos];

        //Asignar valor a cada valor de la matriz
        rellenarDatos(estudiantes, modulos, entrada, matriz);

        //Menu para pedir media de los alumnos o total
        System.out.println("----------Menu----------");
        System.out.println("1. Media de un alumno" );
        System.out.println("2. Porcentaje de aprobados \n" );
        System.out.print("Ingrasa la respuesta: "); int opcion = entrada.nextInt();

        //Asignacion de variables usables
        double mediaAlumno = 0;

        //Grupo de opciones
        switch (opcion) {
            //Funciones de escritura
            case 1: //Entra al promedio de alumnos
                System.out.print("Para calcular el promedio del alumno necesitamos su indice: ");
                int alumno = entrada.nextInt();
                promedioAlumno(estudiantes, modulos, alumno, mediaAlumno, matriz);
                break;
            case 2: //Entra al porcentaje de alumnos aprobados
                System.out.print("Ingrese el indice del modulo: ");
                int moduloIndice = entrada.nextInt();
                porcentajeAprobadosModulo(estudiantes, modulos, entrada, matriz, moduloIndice);
                break;
        }
    }

    //Funciones
    //-----------------------------------------------------------------------------------------------------|

    //Funcion para el relleno de datos de una matriz
    public static void rellenarDatos(int estudiantes, int modulos, Scanner entrada, double[][] matriz) {
        for (int c = 0; c < estudiantes; c++) {
            for (int f = 0; f < modulos; f++) {
                System.out.printf("Introduce la nota del alumno %d modulo %d : ", c + 1, f + 1);
                matriz[c][f] = entrada.nextDouble();
            }
            System.out.println();
        }
    }


    //Funcion para ver el promedio de un alumno
    public static void promedioAlumno(int estudiantes, int modulos, int alumno, double mediaAlumno, double[][] matriz) {
        int cont = 0;
        for (int c = 0; c < estudiantes ; c++){ //Recorre entre los estudiantes y el modulo sumando su media y sacando el promedio
            for (int f = 0 ; f < modulos ; f++){
                if (alumno-1 == c){
                    cont += 1;
                    mediaAlumno = mediaAlumno + matriz[c][f];
                }
            }
        }
        System.out.printf("La media del alumno %d es: %.2f", alumno, mediaAlumno/cont);
    }
    //Funcion para ver el porcentaje de aprobados en un modulo
    public static void porcentajeAprobadosModulo(int estudiantes, int modulos, Scanner entrada, double[][] matriz, int moduloIndice){
        moduloIndice = moduloIndice - 1; //El usuario indicara el modulo desde 1 y por comodidad se le resta 1 para ir con la logica
        int aprobados = 0; 
        for (int c = 0 ; c < estudiantes ; c++){ //Recorre en un bucle de estudiantes cogiendo exactamente el modulo requerido y comparando su nota con 5 o mas
            if (matriz[c][moduloIndice] >= 5){
                aprobados += 1;
            }
        }
        double porcentaje = (aprobados * 100.0) / estudiantes;
        System.out.printf("Porcentaje de aprobados en módulo %d: %.2f%%\n", moduloIndice+1, porcentaje);
    }
}
