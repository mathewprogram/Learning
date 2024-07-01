package expresion_regular;
import java.util.Scanner;
public class Principal1 {

    public static void main(String[] args) {
        //Reconocer un tipo de dato boolean
        Scanner scan = new Scanner(System.in);
        
        //1. Var declare
        String logico_texto;
        String patron = "(true|false|TRUE|FALSE|True|False)"; //Disyunción
        boolean logico, correcto;
        
        
        do {
            //2. Entry
            System.out.print("Es casado? true/false: ");
            logico_texto = scan.next();

            //3. Process
            correcto = logico_texto.matches(patron);
            if(correcto){
                System.out.println("Valor Lógico correcto");
                break;
                //logico = Boolean.parseBoolean(logico_texto); //"true" ---> true
            }else{
            System.out.println("Valor Lógico incorrecto");
            }
        }while(true);
    }    
}
