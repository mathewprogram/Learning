package calculadora;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        opcion();
    }
    
    public static void opcion() {
     Scanner scanner = new Scanner(System.in);
        System.out.println("1: Versión 1");
        System.out.println("2: Versión 2");
        System.out.print("Seleccione la versión a ejecutar:");
        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                version1();
                break;
            case 2:
                version2();
                break;
            default:
                System.out.println("Opción no válida. Por favor seleccione 1 o 2.");    
        }   
        
    }
    
    public static void version1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Version1.0");    
        
        //0. Variables
        double num1, num2, resultado=0; 
        int opcion = 0;
        
        //1.Menu
        System.out.println("Menu\n----------------------"); 
        System.out.println("(1)+ SUMA"); 
        System.out.println("(2)- RESTA");
        System.out.println("(3)* MULTIPLICACIÓN");
        System.out.println("(4)/ DIVISIÓN");
        System.out.println("(5)# POTENCIA");
        
        //2.Entrada
        System.out.print("Elegir una operacion: ");
        opcion = scan.nextInt();
        System.out.print("Ingresa un numero: ");
        num1 = scan.nextDouble();
        System.out.print("Ingresa un numero: ");
        num2 = scan.nextDouble();
        
        System.out.println();
        
        //5.Salida
           
        switch(opcion){
            case 1: resultado = num1+num2;break;
            case 2: resultado = num1-num2;break;
            case 3: resultado = num1*num2;break;
            case 4: resultado = num1/num2;break;
            case 5: resultado = Math.pow(num1, num2);break;
            default: System.out.println("Operador incorrecto");
        }
        System.out.println("El resultado" + "= " + resultado);
        System.out.println("----------------------");
        }
        
        public static void version2() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Version 2.0");
    
        //0. Variables
        double num1, num2, resultado=0; 
        String operador = "";
        String[] operadores = {"+", "-", "*", "/", "#"};
        String[] descripcion = {"Suma", "Resta", "Multiplicar", "Dividir", "Potencia"};
        String patron = "[+-/*#]";
        
        //2.Entrada
        System.out.println("Menu\n-----------");
        for(int i=0; i<operadores.length; i++){
            System.out.println(operadores[i] + " " + descripcion[i]);
        }do{
        System.out.print("Elegir una operacion: ");
        operador = scan.next();}
        while(!operador.matches(patron));
        System.out.print("Ingresa un numero: ");
        num1 = scan.nextDouble();
        System.out.print("Ingresa un numero: ");
        num2 = scan.nextDouble();
        
        System.out.println();
        
        //5.Salida
           
        switch(operador){
            case "+": resultado = num1+num2;break;
            case "-": resultado = num1-num2;break;
            case "*": resultado = num1*num2;break;
            case "/": resultado = num1/num2;break;
            case "#": resultado = Math.pow(num1, num2);break;
            default: System.out.println("Operador incorrecto");
        }
        System.out.println("El resultado" + "= " + resultado);
        System.out.println("----------------------");
        }
    
}
