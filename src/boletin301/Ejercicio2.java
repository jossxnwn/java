/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 2. Crea un programa en Java que pida por pantalla la edad de una persona y muestre por pantalla el año en el que nació. Considera el año actual 2025.*/

import java.util.Scanner;
public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int año = 2025;
        int edad = entrada.nextInt();
        System.out.printf("Naciste en el año: %s", año - edad);
    }
}