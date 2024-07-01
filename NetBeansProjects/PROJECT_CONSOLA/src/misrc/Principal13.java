package misrc;
import java.util.Scanner;
public class Principal13 {

    public static void main(String[] args) {
        
        
        /*{
        //Ingresar grados centigrados y convertilos a fahrenheit 
        Scanner scan = new Scanner(System.in);
        
        //1. startup variables
        double f, c;
        
        //2. Entry
        System.out.print("Ingresar grados centigrados: ");
        c = scan.nextDouble();
        
        //3. Process
        f = (c * 9/5) + 32;
        
        //4. output
        System.out.println("Fahrenheit: " + f);
        }*/
        
        
        //Ingresar grados fahrenheit y convertilos a centigrados
        Scanner scan = new Scanner(System.in);
        
        //1. startup variables
        double f, c;
        
        //2. Entry
        System.out.print("Ingresar grados fahrenheit: ");
        f = scan.nextDouble();
        
        //3. Process
        c = (f - 32) * (5.0/9);
        
        //4. output
        System.out.println("Centigrados: " + c);
        
    }
    
}
