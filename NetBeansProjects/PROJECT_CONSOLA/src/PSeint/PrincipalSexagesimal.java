package pseint;

import java.util.Scanner;

public class PrincipalSexagesimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1. Declarar variables
        double sexa, radian;
        
        //2. Entry
        System.out.print("Ingresa angulo sexagecimal: ");
        sexa = sc.nextDouble();
        
        //3. Process
        radian = sexa * Math.PI / 180;
        
        //4. Output
        System.out.println("Angulo en Radian: " + radian);
    }
    
}
