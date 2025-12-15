/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 1. Crea un programa en Java que muestre la edad que tendrá una persona dentro de 10 años que ahora mismo tiene 25 años.*/

import java.util.Scanner;
public class Ejercicio1 {


    public static void main(String[] args) {
        System.out.print("Ingresa tu edad: ");
        Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();
        System.out.printf("Tu edad en 10 años es: %s", edad + 10);
    }
}
