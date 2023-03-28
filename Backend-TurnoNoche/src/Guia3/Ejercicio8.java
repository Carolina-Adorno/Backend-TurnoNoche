/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
        int dimension;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        dimension=leer.nextInt();
        
        for(int i=0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                if(i>0 && i<(dimension-1)){
                    if(j>0 && j<(dimension-1)){
                System.out.print("  ");
            }else{
            System.out.print("x");
            }
                    else {
            System.out.print("x");
                }
                System.out.println(" ");
        }
    }
        }

    }
}
