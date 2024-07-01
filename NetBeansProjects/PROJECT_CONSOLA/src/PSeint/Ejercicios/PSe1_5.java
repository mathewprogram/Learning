package PSeint.Ejercicios;

import java.util.Scanner;

public class PSe1_5 {

    public static void main(String[] args) {
        //versionEstructurada();
        versionPOAO2();   
    }
    
    public static void versionEstructurada(){
        Scanner scan = new Scanner(System.in);
        
        //Declarar variables
        int num,cua,cub;
        //Entrada
        System.out.print("Ingresar numero: ");
        num = scan.nextInt();
        //Proceso
        cua = (int)Math.pow(num,2);
        cub = (int)Math.pow(num,3);
        //Salida
        System.out.println("Cuadrado: " + cua);
        System.out.println("Cubo: " + cub);
        
    }
    
    public static void versionPOAO1(){
        Ejemplo1_5 poao = new Ejemplo1_5((int)(Math.random()*10+1));
        System.out.println("Numero: " + poao.getNum());
        System.out.println("Cuadrado: " + poao.cuadrado());
        System.out.println("Cuadrado: " + poao.cubo());
    }
    
    public static void versionPOAO2(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese num: ");
        int num = scan.nextInt();
        
        Ejemplo1_5 poao = new Ejemplo1_5(num);
        System.out.println("Numero: " + poao.getNum());
        System.out.println("Cuadrado: " + poao.cuadrado());
        System.out.println("Cuadrado: " + poao.cubo());
    }
    
}
