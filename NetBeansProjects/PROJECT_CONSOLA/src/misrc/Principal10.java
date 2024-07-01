
package misrc;
import java.util.Scanner;
public class Principal10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        
        System.out.print("Ingrese una nota: ");
        nota = scan.nextDouble();
        
        if (nota >= 4.5) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }
        System.out.println("Operador Binario 1");
        System.out.println((nota >= 4.5) ? "Aprobado" : "Suspenso");
        System.out.println("Operador Binario 2");
        String resultado = (nota >= 4.5) ? "Aprobado" : "Supenso";
        System.out.println(resultado);
    }
    
}
