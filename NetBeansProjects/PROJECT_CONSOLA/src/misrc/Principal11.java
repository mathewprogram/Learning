package misrc;

import java.util.Scanner;

public class Principal11 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota; //double nota = 0.0 - al declarar asi la variable la iniciamos "limpias";
        String evaluar; // String evaluar = "" - al declarar asi la variable la iniciamos "limpias";
        
        System.out.print("Ingrese nota: ");
        nota = scan.nextDouble();
        
        if(nota >= 0 && nota <= 5) {
           evaluar = "Insuficiente";
        }else if(nota >= 5 && nota <= 6){
            evaluar = "Suficiente";
        }else if(nota >= 6 && nota <= 8){
            evaluar = "Bien";
        }else if(nota >=8 && nota <= 9){
            evaluar = "Notable";
        }else if(nota >= 9 && nota <= 10){
            evaluar = "Sobresaliente";
        }else {
        evaluar = "N/A";
    }
        System.out.println("Nota: " + evaluar);
    }
    
}
