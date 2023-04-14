package Eje5Guia7Extra;

import java.util.Scanner;

public class empleado {
/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". */
    public String nombre;
    public int edad;
    public double salario;

    public empleado() {
    }

    public empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
/*Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.*/
    public double calcularAumento(){
        if (edad>30){
            salario=salario*0.1; 
        }else {
           salario=salario*0.05;
           
    }return salario;
    }
}
