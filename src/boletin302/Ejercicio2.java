package boletin302;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 15/12/25
 */
/*Ejercicio 2. Crea un programa en Java que inicialice un array con los siguientes elementos en este orden: 3, 5, 7, 2 y 9. Se le pedirá al usuario el índice del elemento a borrar, hasta que no queden más. En el momento del borrado, se mostrará el elemento borrado por pantalla. Después de eliminar el último, se imprimirá además Fin. Si el índice introducido no existe se imprimirá Error. Cada vez que se elimine un elemento el array deberá reducir su tamaño para ajustarse.

NOTA 1: Utiliza System.out.println para imprimir.

NOTA 2: En realidad un array no se puede reducir, lo que debes hacer es crear un nuevo array de un tamaño una unidad menor, copiar a ese array los elementos que quedan del original y realizar un cambio de referencias.*/
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = {3,5,7,2,9};
        while (numeros.length > 0){
            System.out.println(Arrays.toString(numeros));
            System.out.println("Ingresa el indice que quieres eliminar");
            int indice = entrada.nextInt();
            if (indice > numeros.length || indice < 0){
                System.out.println("Error");
            }
            else{
                int j = 0;
                System.out.println("Elemento borrado: "+ numeros[indice]);
                int[] nuevoArray = new int[numeros.length-1];
                for(int i = 0; i < numeros.length ; i++){
                    if(i != indice){
                        nuevoArray[j] = numeros[i];
                        j++;
                    }
                }
                numeros = nuevoArray;
            }
        }
        System.out.println("Fin");

    }
}