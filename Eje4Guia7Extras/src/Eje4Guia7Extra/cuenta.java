package Eje4Guia7Extra;

public class cuenta {
/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".*/
    
    public double saldo;
    public String titular;

/* Luego, crea un método
"retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que 
el saldo nunca sea negativo después de realizar una transacción de retiro.*/   

    public cuenta() {
    }

    public cuenta(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }
    public void retirarDinero(double cantidad){
        if (cantidad<=saldo){
            saldo-=cantidad;
            
        }else {
            System.out.println("Fondos insuficientes. Busque otro trabajo");
        }
        if (saldo<0){
            saldo=0;
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
