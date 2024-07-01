package misrc;
import java.util.Scanner;
public class Principal12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //1. iniciar variables
        int num, v, val;
        
        //2. Entrada
        System.out.print("Ingrese numero entero: ");
        num = scan.nextInt();
        System.out.print("Ingrese valor v: ");
        v = scan.nextInt();
        
        //3. Process
        switch(num) {
            case 1: val = 100 * v; break;
            case 2: val = (int)Math.pow(100, v); break;
            case 3: val = 100 / v; break;
            default: val = 0;
        }
        System.out.println("Val: " + val);
    }
    
}
