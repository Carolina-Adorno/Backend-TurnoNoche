package main;

import Eje5Guia7Extra.empleado;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        empleado empleado1 =new empleado("Fulanito", 31, 5000);
        empleado empleado2 = new empleado();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        empleado2.nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        empleado2.edad = leer.nextInt();
        System.out.println("Ingrese su salario inicial");
        empleado2.salario = leer.nextDouble();
        
        System.out.println("El salario inicial de "+ empleado1.nombre + " es: "+ empleado1.salario+ " y con el aumento le corresponde un salario total de: "+ (empleado1.salario+empleado1.calcularAumento()));
        System.out.println("El salario inicial de "+ empleado2.nombre + " es: "+ empleado2.salario+ " y con el aumento le corresponde un salario total de: "+ (empleado2.salario+empleado2.calcularAumento()));
    }
}
