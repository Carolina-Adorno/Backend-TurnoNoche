package main;

import Eje6Guia7Extra.rectangulo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

rectangulo rectangulo1 = new rectangulo(4,6);   
        System.out.println("El area del rectangulo es "+ rectangulo1.calcularArea());
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base y altura para un segundo rectangulo");
        rectangulo rectangulo2 = new rectangulo (leer.nextInt(),leer.nextInt());
        System.out.println("El area del segundo rectangulo es "+ rectangulo2.calcularArea());
        
    }
}
