package Guia4;

import java.util.Scanner;
/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese
la palabra “No”.
*/

public class Ejercicio2A {
    public static void main(String[] args) {
      String opcion;
        do{
           datos();
            System.out.println("Desea continuar agregando personas?S/N");
            Scanner leer = new Scanner(System.in);
            opcion=leer.nextLine();
       }while (!(opcion.equals("N")));
    }
    public static void datos(){
        System.out.println("Ingrese el nombre");
        Scanner leer = new Scanner(System.in);
        String nombre=leer.nextLine();
        System.out.println("Ingrese la edad");
        int edad=leer.nextInt();
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else
            System.out.println("Es menor de edad");
    return;
    }
    
}
