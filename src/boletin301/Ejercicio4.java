/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 4. Crea un programa en Java que pida por pantalla una cantidad de tiempo en segundos. Imprime por pantalla sus correspondientes horas, minutos y segundos del valor introducido en este orden y cada uno en una línea.

NOTA: Utiliza println para imprimir los resultados.*/

import java.util.Scanner;
public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una cantidad de segundos: ");
        int segundos_totales = entrada.nextInt();
        int horas = segundos_totales/3600;
        int minutos = (segundos_totales%3600)/60;
        int segundos = segundos_totales % 60;
        System.out.println("Los segundos: " +segundos);
        System.out.println("Los minutos: " +minutos);
        System.out.println("Los horas: " +horas);
    }
}