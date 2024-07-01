package misrc;
import java.util.Scanner;
public class Principal17 {

    public static void main(String[] args) {
        //Validar estatura -  1.72      1.05        2.10  "[0-2]{1}\\.[0-9]{2}"
        Scanner scan = new Scanner(System.in);
        
        //1.variable startup
        String estatura_texto; 
        String patron = "[0-2]{1}\\.[0-9]{2}";
        
        //2.Entry
        System.out.print("Ingrese su estatura: ");
        estatura_texto = scan.next();
        
        //3.Validate entry
        if(estatura_texto.matches(patron)) {
            System.out.println("Estatura valida.");
        }else {
            System.out.println("Estatura invalida.");
        }
        
    }
    
}
