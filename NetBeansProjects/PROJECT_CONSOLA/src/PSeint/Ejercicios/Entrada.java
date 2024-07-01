package PSeint.Ejercicios;

import java.util.Scanner;

public class Entrada {
    
    public static double leerDouble(String mensaje){
    Scanner scan = new Scanner(System.in);
    String patron = "[0-9]|[0-9]{1,2}|[0-9]{1,2}\\.[0-9]{1,2}";
    String calificacion;
    boolean correcto;
    
    do{System.out.print(mensaje);
    calificacion = scan.next();
    correcto = calificacion.matches(patron) && 
            Double.parseDouble(calificacion) >= 0 &&
            Double.parseDouble(calificacion) <= 10;
            
    if(!correcto){
        System.out.println("Error: entrada");
    }
    }while (!correcto);
    return Double.parseDouble(calificacion);
    
    }
    
    public static int leerInteger(String mensaje){
    Scanner scan = new Scanner(System.in);
    String patron = "[0-9]+";
    String numero;
    boolean correcto;
    
    do{System.out.print(mensaje);
    numero = scan.next();
    correcto = numero.matches(patron);
            
    if(!correcto){
        System.out.println("Error: entrada");
    }
    }while (!correcto);
    return Integer.parseInt(numero);
    
    }
    
}
