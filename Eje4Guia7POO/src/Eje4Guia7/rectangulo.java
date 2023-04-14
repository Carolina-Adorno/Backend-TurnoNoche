package Eje4Guia7;

import java.util.Scanner;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base 
y un atributo privado altura.*/
public class rectangulo {
    private double base;
    private double altura;
/*Se deberán además definir los métodos getters, setters y constructores correspondientes.*/

    public rectangulo() {
    }

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     
/*La clase incluirá un método para crear el rectángulo con los datos 
del Rectángulo dados por el usuario*/
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
       this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextDouble();
        
    }
    /*También incluirá un método para calcular la superficie del rectángulo: Superficie = base * altura  */
    public void calcularSuperficie(){
        double superficie = this.base*this.altura;
    }
    /*y un método para calcular el perímetro del rectángulo: Perímetro = (base + altura) * 2 */
    public void calularPerimetro(){
        double perimetro = (this.base+this.altura)*2;
    }
    
    /* Por último, tendremos un método que dibujará
el rectángulo mediante asteriscos usando la base y la altura. */
    public void asteriscos(){
        for (int i = 1; i <= this.altura; i++) {
            for (int j =1; j <= this.base; j++) {
                if (i==1 || i==this.altura || j==1 || j==this.base){
                System.out.print("* ") ;
            } else
                    
                    System.out.print("  ");
            }
            System.out.println(" ");
            
        }
      
    }
}
