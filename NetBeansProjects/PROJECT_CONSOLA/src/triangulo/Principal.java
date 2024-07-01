
package triangulo;

import circulo.Libreria;
import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      //1. Var declare
      double base, altura, area;
      
      //2. Entry
      System.out.print("Ingresar base: ");
      base = sc.nextDouble();
      
      System.out.print("ingresar altura: ");
      altura = sc.nextDouble();
      
      //3. Process
      area = 0.5 * base * altura;
      
      //4. Output
      System.out.println("El area del triangulo es: " + Libreria.redondear(area));
    }
    
}
