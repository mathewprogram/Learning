package retorno;

import calculadora.Calculadora;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        
        {
        int[] vector = retornarVector1();
        for(int numero: vector){
            System.out.println(numero);
        }
        }
        
        {
            int[] vector = {4,5,6};
            System.out.println(Arrays.toString(vector));
        }
        
        {
            String[] vector = retornarVector2();
            System.out.println(Arrays.toString(vector));
            for(String texto: vector){ //foreach, recorrer por elemento
                System.out.println(texto + " " + texto.length() + " " + texto.toUpperCase());
            }
        }
        {
            int i;
        }
        for(int i=0; i<=10; i++){   
        }
        /*
        int             int x = 5;      //Valor
        double          double y = 1.3; //Valor
        String          String z = "Hola"; //Objeto
        boolean
        
        //Tipos de datos objetos
        Calculadora
        Triangulo
        int[]           // vector
        */
    }
    
    public static int[] retornarVector1(){
        int[] vector = {1,3,5}; 
        return vector;
    }
    
    public static String[] retornarVector2(){
        String[] vector = {"Luis","Miguel"}; 
        return vector;
    }
    
    public static Calculadora retornoObjeto1(){
        return new Calculadora();
    }
    
    public static Calculadora retornoObjeto2(){
        Calculadora c = new Calculadora();
        return c;
    }
    public static int retornoValor1(){
        return 5;
    }
    
    public static int retornoValor2(){
        int numero = 5;
        return numero;
    }
   
}
