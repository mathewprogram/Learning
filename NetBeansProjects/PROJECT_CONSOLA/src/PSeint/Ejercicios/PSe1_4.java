package PSeint.Ejercicios;

import java.util.Scanner;

public class PSe1_4 {

    public static void main(String[] args) {
        //versionEstructurada();
        versionPOAO1();
    }
    
    public static void versionEstructurada(){
        Scanner scan = new Scanner(System.in);
        
        //Declarar variables
        String codigo;
        double c1, c2, c3, c4, c5, pro;
        
        //Entrada
        System.out.print("Ingresar codigo matricula: ");
        codigo = scan.next();
        System.out.print("Ingresar calificacion 1: ");
        c1 = scan.nextDouble();
        System.out.print("Ingresar calificacion 2: ");
        c2 = scan.nextDouble();
        System.out.print("Ingresar calificacion 3: ");
        c3 = scan.nextDouble();
        System.out.print("Ingresar calificacion 4: ");
        c4 = scan.nextDouble();
        System.out.print("Ingresar calificacion 5: ");
        c5 = scan.nextDouble();
        
        //Proceso 
        pro=(c1+c2+c3+c4+c5)/5;
        
        //Salida
        System.out.printf("Alumno: %2s - Media: %3.2f",codigo,pro);
        System.out.println();
        System.out.printf("Alumno: %2s - Media: %.0f",codigo,pro);
        System.out.println();
    }
    
    public static void versionPOAO(){
        Ejemplo1_4 poao = new Ejemplo1_4();
        
        poao.codigo();
        poao.calificaciones();
        String codigo = poao.getCodigo();
        double promedio = poao.pro();
        System.out.println("Alumno: " + codigo + " - " + "Media: " + promedio);
        
    }
    //Codigo en clase
    public static void versionPOAO1(){
        Ejemplo1_4 poao = new Ejemplo1_4();
        poao.entrada();
        
        Ejemplo1_4.cabecera();
        poao.cuerpo();
        
    }
    
}
