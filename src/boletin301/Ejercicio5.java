/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 5. Crea un programa en Java que pida 3 números por pantalla y los muestre ordenados de mayor a menor.

NOTA: utiliza para imprimir cada número un println distinto.*/

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        int aux;
        if (num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num1 < num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if (num2 < num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        System.out.println("Ordenado de mayor a menos");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
