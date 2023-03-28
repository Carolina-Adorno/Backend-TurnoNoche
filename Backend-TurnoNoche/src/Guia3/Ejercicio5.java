/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *
 * @author alvar
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int limite, aux, suma;
        Scanner leer  =new Scanner(System.in);
        System.out.println("Ingrese un limite");
        limite=leer.nextInt();
        suma=0;
        while(suma<limite){
            System.out.println("Ingrese un número");
            aux=leer.nextInt();
            suma+=aux;
      
        }
        System.out.println("El número supera al limite");
    }
    
}
