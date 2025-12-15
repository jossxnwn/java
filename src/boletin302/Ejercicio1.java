package boletin302;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 15/12/25
 */
/*indice*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numeros[];
        System.out.print("Ingresa un la cantidad de numeros que ingresaras: ");
        int tamaño = entrada.nextInt();
        numeros = new int[tamaño];
        int num;
        for(int i = 0; i < tamaño ; i++){
            System.out.print("Ingresa un numero: ");
            num = entrada.nextInt();
            numeros[i] = num;
        }
        for(int i = tamaño-1; i >= 0 ; i--){
            System.out.println(numeros[i]);
        }

    }
}
