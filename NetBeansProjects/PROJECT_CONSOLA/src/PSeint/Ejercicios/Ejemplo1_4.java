package PSeint.Ejercicios;

import java.util.Scanner;

public class Ejemplo1_4 {
    //Variables de instancia (Atributos)
    private String codigo;
    private double c1, c2, c3, c4, c5;
    
    //Constructores

    public Ejemplo1_4() {
        this.codigo = "";
        this.c1 = 0.0;
        this.c2 = 0.0;
        this.c3 = 0.0;
        this.c4 = 0.0;
        this.c5 = 0.0;
    }
    public Ejemplo1_4(String codigo, double c1, double c2, double c3, double c4, double c5) {
        this.codigo = codigo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
    }
    
    //Metodos Set y Get

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getC1() {
        return c1;
    }
    public void setC1(double c1) {
        this.c1 = c1;
    }
    public double getC2() {
        return c2;
    }
    public void setC2(double c2) {
        this.c2 = c2;
    }
    public double getC3() {
        return c3;
    }
    public void setC3(double c3) {
        this.c3 = c3;
    }
    public double getC4() {
        return c4;
    }
    public void setC4(double c4) {
        this.c4 = c4;
    }
    public double getC5() {
        return c5;
    }
    public void setC5(double c5) {
        this.c5 = c5;
    }
   
    //Metodo ToString
    @Override
    public String toString() {
        return "Ejemplo1_4{" + "codigo=" + codigo + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + ", c4=" + c4 + ", c5=" + c5 + '}';
    }
    
    //Metodos Otros
    public String codigo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar codigo matricula: ");
        this.codigo = scan.next();
        return codigo;
    }
    public void calificaciones(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        this.c1 = scan.nextDouble();
        System.out.print("Ingrese numero 2: ");
        this.c2 = scan.nextDouble();
        System.out.print("Ingrese numero 3: ");
        this.c3 = scan.nextDouble();
        System.out.print("Ingrese numero 4: ");
        this.c4 = scan.nextDouble();
        System.out.print("Ingrese numero 5: ");
        this.c5 = scan.nextDouble();
        
    }
    public double pro(){
        return (c1+c2+c3+c4+c5)/5;
    }
    
    //codigo en clase
    
    //Metodos Otros
    public double promedio(){
        return (c1+c2+c3+c4+c5)/5;
    }
    public static void cabecera(){
    System.out.printf("%6s %8s %10s\n","Codigo","Promedio","Redondeado");
    System.out.printf("%6s %8s %10s\n","------","--------","----------");
    }
    public void cuerpo(){
    System.out.printf("%6s %8.2f %10.0f\n",codigo,promedio(),promedio());
    }
    public void entrada(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese codigo matricula: ");
    codigo = scan.next();
    c1 = Entrada.leerDouble("Ingresar calificacion 1: ");
    c2 = Entrada.leerDouble("Ingresar calificacion 2: ");
    c3 = Entrada.leerDouble("Ingresar calificacion 3: ");
    c4 = Entrada.leerDouble("Ingresar calificacion 4: ");
    c5 = Entrada.leerDouble("Ingresar calificacion 5: ");
    }
   
    

}
