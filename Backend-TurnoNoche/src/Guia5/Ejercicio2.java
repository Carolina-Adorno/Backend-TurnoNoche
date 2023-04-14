package Guia5;


import java.util.Scanner;

/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un
número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido       
 */

public class Ejercicio2 {
    public static void main(String[] args) {
    
        
        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int tamanio = leer.nextInt();
        int vector[]= new int [tamanio];
        
        for (int i = 0; i <tamanio; i++) {
            vector[i]= (int)(Math.random()*10);
            System.out.print("[ " + vector[i] + " ]" );
            
        }
        System.out.println("");
        
        System.out.println("Ingrese un número a buscar en el vector");
        int numero =leer.nextInt();
        int contador=0;
        for (int i = 0; i <tamanio; i++) {
            if (numero == vector[i]){
                System.out.println("El número se encuentra en la posición "+ (i+1));
             contador++;
            }
          
        }
    if (contador>1){
        System.out.println("Se encuentra repetido "+ contador+ " veces.");
    }    else
            System.out.println("No se encuentra repetido");
    }
}
    