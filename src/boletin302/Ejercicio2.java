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
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[4];
        numeros[0] = 3;
        numeros[1] = 5;
        numeros[2] = 7;
        numeros[3] = 2;
        numeros[4] = 9;
        System.out.print("Ingresa el indice a borar en una lista de 5 numeros: ");
        int indice = entrada.nextInt();
        switch (indice){
            case 1:
                numeros[0] = 0;
                break;
            case 2:
                numeros[1] = 0;
                break;
            case 3:
                numeros[2] = 0;
                break;
            case 4:
                numeros[3] = 0;
                break;
            case 5:
                numeros[4] = 0;
                break;
        }
    }
}