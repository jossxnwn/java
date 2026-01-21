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
        System.out.println("-----Menu-----");
        System.out.println("a. Media de un alumno" );
        System.out.println("b. Porcentaje de aprobados" );

        //Asignacion de variables usables
        double mediaAlumno = 0;
        int alumno = 2;

        //Funciones de escritura
        promedioAlumnos(estudiantes, modulos, alumno, mediaAlumno, matriz);
        System.out.println();
        porcentajeAprobados(estudiantes, modulos, entrada, matriz);
        
    }
    //Funciones
    //-----------------------------------------------------------------------------------------------------|
    public static void rellenarDatos(int estudiantes, int modulos, Scanner entrada, double[][] matriz) {
        for (int c = 0; c < estudiantes; c++) {
            for (int f = 0; f < modulos; f++) {
                System.out.printf("Introduce la nota del alumno %d modulo %d : ", c + 1, f + 1);
                matriz[c][f] = entrada.nextDouble();
            }
        }
    }

    public static void promedioAlumnos(int estudiantes, int modulos, int alumno, double mediaAlumno, double[][] matriz) {
        int cont = 0;
        for (int c = 0; c < estudiantes ; c++){
            for (int f = 0 ; f < modulos ; f++){
                if (alumno == c){
                    cont += 1;
                    mediaAlumno = mediaAlumno + matriz[c][f];
                }
            }
        }
        System.out.printf("La media del alumno %d es: %.2f", alumno+1, mediaAlumno/cont);
    }
    public static void porcentajeAprobados(int estudiantes, int modulos, Scanner entrada, double[][] matriz){
        System.out.print("Ingresa el índice del módulo (0-" + (modulos-1) + "): ");
        int modulo = entrada.nextInt();
        
        int aprobados = 0;
        for (int c = 0 ; c < estudiantes ; c++){
            if (matriz[c][modulo] >= 5){
                aprobados += 1;
            }
        }
        double porcentaje = (aprobados * 100.0) / estudiantes;
        System.out.printf("Porcentaje de aprobados en módulo %d: %.2f%%\n", modulo+1, porcentaje);
    }
}
