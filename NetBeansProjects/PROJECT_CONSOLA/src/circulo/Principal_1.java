
package circulo;

import java.util.Scanner; //Importamos las utilidades si el sistema falla por defecto

public class Principal_1 {

    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in); //let you use the keyboard and interact with the UI
       //1. Declaracion de variables
       double radio, area, perimetro;
       
       //2. Entrada
       System.out.print("Ingrese radio: ");
       radio = sc.nextDouble();
       
       //Proceso
       area = Libreria.MIPI * Math.pow(radio, 2);
       perimetro = 2 * Libreria.MIPI * radio;
       
       //4. Salida
       System.out.println("Area: " + Libreria.redondear(area));
       System.out.println("Perimetro: " + Libreria.redondear(perimetro));

      
    }
    
}
