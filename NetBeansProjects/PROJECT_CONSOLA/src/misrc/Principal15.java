package misrc;
import java.util.Scanner;
public class Principal15 {

    public static void main(String[] args) {
        //Conocer un numero entero
        Scanner scan = new Scanner(System.in);
        
        //1. startup variables
        int entero_numero = 0; //343
        String entero_texto;      // "343"(trecientos cuarenta y tres)
        String patron = "[0-9]+"; // Regex
        //2. Entry
        System.out.print("Ingresa su edad: ");
        entero_texto = scan.next();
        if(entero_texto.matches(patron)) {
            entero_numero = Integer.parseInt(entero_texto);
            if(entero_numero >= 18) {
                System.out.println("Mayor de edad.");
            }else {
                System.out.println("Menor de edad");
            }
        }else {
            System.out.println("Entrada incorrecta: No es numero Entero");
        }
    }  
}
