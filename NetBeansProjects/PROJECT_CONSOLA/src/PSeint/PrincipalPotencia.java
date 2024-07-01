package pseint;

import java.util.Scanner;

public class PrincipalPotencia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //1. Var declare
        long base, exponente, power;
        
        //2. Entry
        System.out.print("Ingresar base: ");
        base = scan.nextLong();
        
        System.out.print("Ingresar exponente: ");
        exponente = scan.nextLong();
        
        //3. Process
        power =(long) Math.pow(base, exponente);
        
        //4. Output
        System.out.println("Potencia: " + power);
    }
    
}
