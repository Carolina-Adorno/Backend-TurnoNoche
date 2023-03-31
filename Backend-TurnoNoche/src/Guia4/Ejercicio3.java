package Guia4;

import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado 
a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad 
de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje 
indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de euros a convertir");
        Scanner leer = new Scanner(System.in);
        double euros = leer.nextDouble();
        System.out.println("Elija el cambio de divisas a realizar:");
        System.out.println("1-Libras");
        System.out.println("2-Euros");
        System.out.println("3-Yenes");
        int opcion = leer.nextInt();
        retorno(euros, opcion);

    }

    public static void retorno(double euros, int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("El cambio a libras es: " + (euros * 0.86));
                break;
            case 2:
                System.out.println("El cambio a dolares es: " + (euros * 1.28611));
                break;
            case 3:
                System.out.println("El cambio a yenes es: " + (euros * 129.852));
                break;

        }
    }
}
