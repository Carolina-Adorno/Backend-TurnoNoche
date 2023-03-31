package Guia4;

import java.util.Scanner;
/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

public class Ejercicio3A {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad a convertir");
        Scanner leer = new Scanner(System.in);
        double euros=leer.nextDouble();
        
        System.out.println("Elija la opción:\n1-Libras\n2-Dolares\n3-Yenes");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                libras(euros);
                break;
            case 2:
                dolares(euros);
                break;
            case 3:
             yenes(euros); 
            break;
          
        }
    }
    public static void libras(double euros){
        double libras=euros*0.86;
        System.out.println("La conversión es: "+ libras+  " libras.");
    
    } 
    public static void dolares(double euros){
        double dolares=euros*1.28611;
        System.out.println("La conversión es: "+ dolares+  " dolares.");
}
      public static void yenes(double euros){
        double yenes=euros*129.852;
        System.out.println("La conversión es: "+ yenes +  " yenes.");
      }
}