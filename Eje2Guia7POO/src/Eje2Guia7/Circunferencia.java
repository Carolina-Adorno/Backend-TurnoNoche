package Eje2Guia7;

import static java.lang.Math.PI;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).

 */

public class Circunferencia {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio = leer.nextDouble();
    }

    public void area() {
        double area = Math.PI * this.radio * this.radio;
        System.out.println("El area del circulo es: "+ area);
    }
    public void perimetro(){
        double perimetro = 2 * Math.PI * this.radio;
        System.out.println("El perimetro del circulo es: "+ perimetro);
    }
}
