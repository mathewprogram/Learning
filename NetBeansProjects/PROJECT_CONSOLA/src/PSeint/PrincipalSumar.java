package pseint;

import java.util.Scanner;

public class PrincipalSumar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //1. Var declare
        int s, n1, n2;
        
        //2. Entry
        System.out.print("Ingresar número 1: ");
        n1 = scan.nextInt();
        
        System.out.print("Ingresar número 2: ");
        n2 = scan.nextInt();
        
        //Process
        s = n1 + n2;
        
        //Outro
        System.out.println("Suma: " + s);
    }
    
}
