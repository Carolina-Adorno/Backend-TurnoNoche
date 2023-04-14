package Eje2Guia7Extra;

import java.util.Scanner;

 /*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.*/
public class puntos {

   public double x1;
   public double y1;
    public double x2;
    public double y2;

    public puntos() {
    }

    public puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /*Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
y los ingresa en los atributos del objeto. */
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número de X");
        x1 = leer.nextDouble();
        System.out.println("Ingrese un número para Y");
        y1 = leer.nextDouble();
        System.out.println("Ingrese un número de X");
        x2 = leer.nextDouble();
        System.out.println("Ingrese un número para Y");
        y2 = leer.nextDouble();
    }
    /*Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. */
    public double calcularDistancia(){
        double distancia = Math.sqrt((Math.pow(x2-x1, 2)+(Math.pow(y2-y1,2))));
        /*raiz cuadrada(x2-x1)+(y2-y1)*/
        return distancia;
    }
}
