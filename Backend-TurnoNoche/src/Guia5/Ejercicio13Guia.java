package Guia5;

import java.util.Scanner;

/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */

public class Ejercicio13Guia {

    public static void main(String[] args) {

 Scanner leer = new Scanner(System.in);
        String [] Equipo = new String [6];
        System.out.println("Ingrese los nombres");
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese nombre"+(i+1) ); 
            Equipo [i] = leer.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+ Equipo [i]+ " ");
        
        
    }
    }
}
