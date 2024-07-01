package PSeint.Ejercicios;
import java.util.Scanner;
public class PSe1_3 {

    public static void main(String[] args) {
        //versionEstructurada();
        versionPOAO();
    }
    
    public static void versionEstructurada(){
        Scanner scan = new Scanner(System.in);
        
        //Declarar variables
        int a, b;
        double r;
        
        //Entrada
        System.out.print("Ingresar a: ");
        a = scan.nextInt();
        System.out.print("Ingresar b: ");
        b = scan.nextInt();
        
        //Proceso
        r = Math.pow((a+b), 2)/3;
        
        //Salida
        System.out.printf("Resultado: %.2f",r);
        System.out.println();
    }
    
    public static void versionPOAO(){
        Ejemplo1_3 poao = new Ejemplo1_3();
        poao.entrada();
        poao.imprimirResultado();
        
    }
    
}
