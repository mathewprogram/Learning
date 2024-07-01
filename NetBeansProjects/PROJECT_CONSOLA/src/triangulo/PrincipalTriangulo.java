package triangulo;
import java.util.Scanner;
public class PrincipalTriangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //1.Variables
        double base, altura;
        
        //2.Entry
        System.out.print("Ingresar base: ");
        base = scan.nextDouble();
      
        System.out.print("ingresar altura: ");
        altura = scan.nextDouble();
        
        //3.Creat an object
        Triangulo triangulo = new Triangulo(base,altura);
        System.out.println(triangulo);
        System.out.println(triangulo.getArea());
        triangulo.setAltura(10);
        System.out.println(triangulo.getArea());
        
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setBase(8);
        triangulo1.setAltura(2);
        System.out.println(triangulo1.getArea());
        System.out.println("Altura: " + triangulo1.getAltura());
        
    }
    
}
