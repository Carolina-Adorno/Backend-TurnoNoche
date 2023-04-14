package Eje3Guia7;

import java.util.Scanner;

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2*/
public class operacion {

    private double numero1;
    private double numero2;

    /*Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
     */
    public operacion() {
    }

    public operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /*Métodos get y set. */
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /*Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los
    atributos del objeto.*/
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        this.numero1 = leer.nextDouble();
        this.numero2 = leer.nextDouble();
    }

    /*Método sumar(): calcular la suma de los números y devolver el resultado al main.*/
    public void sumar() {
        double suma = this.numero1 + this.numero2;
        System.out.println("El resultado de la suma es: " + suma);
    }

    /*Método restar(): calcular la resta de los números y devolver el resultado al main*/
    public void restar() {
        double resta = this.numero1 - this.numero2;
        System.out.println("El resultado de la resta es: " + resta);
    }

    /*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar
por cero,el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve
el resultado al main*/
    public void multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: el método devuelve 0");
        }
        double multiplica = this.numero1 * this.numero2;
        System.out.println("El resultado de la multiplicacion es: " + multiplica);

    }

    /*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y
se devuelve el resultado al main.*/
    public void division() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: el método devuelve 0");
        }
        double dividir = this.numero1 / this.numero2;
        System.out.println("El resultado de la division es: " + dividir);

    }
}
