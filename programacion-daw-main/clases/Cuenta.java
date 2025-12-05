package clases;

import clases.src.Persona;

public class Cuenta {
    String numeroCuenta;
    double saldo;
    Persona cliente;

    public Cuenta(){

    }
    
    public Cuenta(String numeroCuenta, double saldo, Persona cliente){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void imprimeCuenta(){
        System.out.println();
    }
}
