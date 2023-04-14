package Eje6Guia7Extra;

import java.util.Scanner;

/*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"*/
public class rectangulo {
    public int lado1;
    public int lado2;

    public rectangulo() {
    }

    public rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
/* y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la 
clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
*/
    public int calcularArea(){
        int area = lado1*lado2;
        return area;
    }
}
