package boletin302;

import java.util.Arrays;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 8/1/26
 */
/*Ejercicio 3. Crea un programa en Java que realice las siguientes acciones:

Crea una matriz (array bidimensional). El usuario introducirá el número de columnas y filas en ese orden.
A continuación, introducirá los valores columna a columna.
Calcula el valor de la suma de cada columna. Imprime esos valores en orden con System.out.println en orden.
Calcula el valor de la suma de cada fila. Imprime esos valores en orden con System.out.println en orden.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de la matriz");
        System.out.print("Alto (Filas): ");
        int altura = entrada.nextInt();
        System.out.print("Ancho (Columnas): ");
        int anchura = entrada.nextInt();

        // CORRECCIÓN 1: Primero Altura (filas), luego Anchura (columnas)
        int[][] Matriz = new int[altura][anchura];

        // Vamos a rellenarla con algo para verla (opcional, solo visual)
        // Por defecto en Java está llena de ceros.

        System.out.println("\n--- Tu Matriz ---");

        // CORRECCIÓN 2: Uso de nombres claros (i, j) o (fila, columna)
        // El bucle externo controla las FILAS (baja verticalmente)
        for (int i = 0; i < Matriz.length; i++) {

            // El bucle interno controla las COLUMNAS (avanza horizontalmente)
            for (int j = 0; j < Matriz[i].length; j++) {
                // CORRECCIÓN 3: 'print' en lugar de 'println' para que salgan en la misma línea
                // Agregamos un espacio " " para que no se peguen los números
                System.out.print(Matriz[i][j] + " ");
            }

            // Cuando terminamos una fila completa, hacemos el salto de línea
            System.out.println();
        }
    }
}
