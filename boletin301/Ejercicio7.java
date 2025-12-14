package boletin301;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 7. Crea un programa en Java que pida un número por consola e imprima por pantalla Primo si este es un número primo, y No primo en caso contrario.*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        boolean esPrimo = true;
        if (numero <= 1 ) {
            esPrimo = false;
        }else{
            for(int i = 2 ; i < numero ; i++){
                if(numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
