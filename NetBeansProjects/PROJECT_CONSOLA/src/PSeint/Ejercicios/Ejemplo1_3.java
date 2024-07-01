package PSeint.Ejercicios;

import java.util.Scanner;

public class Ejemplo1_3 {
    //Variables de instancia (Atributos)
    private int a, b;
    private double r;
    
    //Constructores
    public Ejemplo1_3() {
        this.a = 0;
        this.b = 0;
        this.r = 0.0;
    }

    public Ejemplo1_3(int a, int b, double r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }
    
    //Metodos Set y Get
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Ejemplo1_3{" + "a=" + a + ", b=" + b + ", r=" + r + '}';
    }
    
    //Metodos Otros
    public double resultado(){
        return Math.pow((a+b),2)/3;
    }
    
    public void imprimirResultado(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Resultado: %.2f",resultado());
        System.out.println();   
    }
    
    public void entrada(){
        a = Entrada.leerInteger("Ingresar a: ");
        b = Entrada.leerInteger("Ingresar b: ");
    }
}
