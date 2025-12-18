package boletin301;

/**
 * Author: Josue Francis Sayritupac Izquierdo
 * Email: a25josuesi@iesantonlosada.gal
 * EmailPersonal: Josue108125@gmail.com
 * Date: 12/14/2025
 */
/*Ejercicio 8. Crea un programa en Java que pida un número por consola. A continuación, calcula el valor de la raíz cuadrada aproximada por debajo de ese número utilizando bucles. Por ejemplo: la raíz cuadrada de 33 sería 5, porque 5·5 = 25 y 6·6 = 36. Imprime el valor de la raíz cuadrada por pantalla. Si el valor es menor que 1, escribe Error por pantalla.*/

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);
        System.out.print("Ingresa un un numero para calcular su raiz cuadrada: ");
        int num = entrda.nextInt();
        double resu = 0;
        for(int i = 0 ; i * i < num ; i ++ ){
            resu = i;
        }
        System.out.println(resu);
    }
}
