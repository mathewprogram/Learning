package pseint;

import java.util.Scanner;

public class PrincipalIntercambiar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //1. Var declare
        int a, b, c;
        
        //2. Entry
        System.out.print("Ingrese a: ");
        a = scan.nextInt();
        
        System.out.print("Ingrese b: ");
        b = scan.nextInt();
        
        //3. Process
        c = a;
        a = b;
        b = c;
        
        //4.Output
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
}
