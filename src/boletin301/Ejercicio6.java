package boletin301;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 6. Crea un programa en Java que pida un número por teclado entre 1 y 7. Indica el día de la semana correspondiente en este orden: lunes, martes, miércoles, jueves, viernes, sábado y domingo. Si el número introducido no está en el rango, imprime Fuera de rango.

NOTA: Utiliza la estructura switch.*/

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero equivalente al dia de la semana: ");
        int dia = entrada.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Fuera de rango");
        }
    }
}
