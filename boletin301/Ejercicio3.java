/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 3. Crea un programa en Java que calcule el precio de una compra en una frutería. Primero pediremos por pantalla los kilogramos comprados de manzanas y después los kilogramos de naranjas. Se imprimirá por pantalla el importe a pagar. Los precios de las frutas son los siguientes:

Manzanas: 3,5 €/kg
Naranjas: 1,6 €/kg
NOTA: utilizad el tipo de valor double.*/

import java.util.Scanner;
public class Ejercicio3 {


    public static void main(String[] args) {
        double manzana = 3.5;
        double naranja = 1.6;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa los kilogramos comprados de una manzana: ");
        double kilo_manzana = entrada.nextFloat();
        System.out.print("Ingresa los kilogramos comprados de una naraja: ");
        double kilo_naranja = entrada.nextFloat();
        System.out.printf("El importe a pagar por manzanas es: %f\nEl importe a pagar por naranjas es: %f", manzana * kilo_manzana, kilo_naranja * naranja);


    }
}