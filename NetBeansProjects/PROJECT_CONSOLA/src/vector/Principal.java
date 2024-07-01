package vector;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        System.out.println("Formas declarar vector");
        System.out.println("----------------------");
        System.out.println("Estatico");
                      //0 1 2 3 4 5 6 7 8  
        int[] vector = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<vector.length; i++){
        System.out.println(vector[i] + " ");
        }
        
        System.out.println("----------------------");
        System.out.println();
        
        System.out.println("Dinamico");
        vector[8] = 33; //Cambiar de valor si
        System.out.println("Posicion 8: " + vector[8]);
        
        System.out.println("----------------------");
        System.out.println();
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el vector: ");
        int n = scan.nextInt();
        int[] vector1 = new int[n];
        for(int i=0; i<n; i++){
        System.out.print("Ingrese numero [" + i + "] = ");
        vector1[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        System.out.println();
    }
    
}
