package expresion_regular;
import java.util.Scanner;
public class Principal2 {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        ejemplo1();
    }
    
    //Validar un numero entero
    public static void ejemplo1() {
        String cadena = "";
        String patron = "[+-]?[0-9]+|([+-]?[0-9]+[\\.,][0-9]+)";
        //String patron = "\\d+";
        boolean correcto;
        do{
            System.out.print("Ingrese una cadena: ");
            cadena = scan.next();
            correcto = cadena.matches(patron);
            if(!correcto) System.out.println("No es un numero entero! Prueba otro.");
        }while(!correcto);
    }
    
    //Validar cadena que no tenga ningun digito
    public static void ejemplo2() {
        String cadena = "";
        //String patron = "[^0-9]+";
        String patron = "\\D+";
        boolean correcto;
        do{
            System.out.print("Ingrese una cadena: ");
            cadena = scan.next();
            correcto = cadena.matches(patron);
            if(!correcto) System.out.println("Tiene un digito! Vuelva a probar.");
        }while(!correcto);
    }
    
    //Verificar si existen espacios en blanco.
    public static void ejemplo3() {
        String cadena = "";
        //String patron = "+";
        String patron = "\\S+";
        boolean correcto;
        do{
            System.out.print("Ingrese una cadena: ");
            cadena = scan.next();
            correcto = cadena.matches(patron);
            if(!correcto) System.out.println("Tiene espacios en blanco! Vuelva a probar.");
        }while(!correcto);
    }
    
    //Eliminar muchos espacios en blanco y reemplazar con uno.
    public static void ejemplo4() {
        String cadena = "";
        //String patron = "+";
        String patron = "\\s+";
        String cadenaSinEspacios;
        System.out.print("Ingrese una cadena: ");
        cadena = scan.nextLine();  //Mihai      Ioni            Matei           
        cadenaSinEspacios = cadena.replaceAll(patron, " ");
        System.out.println(cadena);
        System.out.println("Resultado: " + cadenaSinEspacios);
    }
    
    //Eliminar numeros
    public static void ejemplo5() {
        String cadena = "";
        //String patron = "+";
        String patron = "\\d+";
        String cadenaLimpia;
        cadena = "Luis tiene 25 años y Carmen 22 y sus telefonos son 643533111 y 664574321.";
        cadenaLimpia = cadena.replaceAll(patron, "--");
        System.out.println(cadena);
        System.out.println("Resultado: " + cadenaLimpia);
    }
    
    //Buscar la mayuscula y poner el espacio: MihaiIoniMatei = Mihai Ioni Matei
    public static void ejemplo6() {
        Scanner scan = new Scanner(System.in);
        String cadena = "";
        String patron = "(?<!^)(?=[A-Z])";
        String cadenaConEspacios;

        System.out.print("Ingrese una cadena: ");
        cadena = scan.nextLine();  // Ejemplo: MihaiIoniMatei
        cadenaConEspacios = cadena.replaceAll(patron, " ");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Resultado: " + cadenaConEspacios);
    }
    
    //ER que coincida con cadenas que inician en 'ab' y continuan con cero o mas caracteres cualquiera
    public static void ejemplo7() {
        String cadena = "";
        String patron = ".*";
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena: ");
            cadena = scan.nextLine();  
            correcto = cadena.matches(patron);
            if(!correcto)
            System.out.println("no cumple con el patron. Vuelva a probar.");    
        }while(!correcto);
        
    }
    
    //Buscar una palabra en un texto
    public static void ejemplo8() {
        String texto = "";
        boolean correcto;
        String textoCorrecto = null;
        String patron = ".*ERROR.*";
        String patron1 = "ERROR";
        texto = "En un puerto ERROR ItalERRORiano al pie de la ERRORmontaña.";  
        correcto = texto.matches(patron);
        if(correcto){
            textoCorrecto = texto.replaceAll(patron1, "");
        }
        System.out.println(texto);
        System.out.println(textoCorrecto);
    }
    
    //Buscar una palabra y reemplazarla
    public static void ejemplo9() {
        String texto = "";
        boolean correcto;
        String textoCorrecto = null;
        String patron = "ERROR";
        texto = "En un puerto ERROR italERRORiano al pie de la ERRORmontaña.";  
        correcto = texto.contains(patron);
        if(correcto){
            textoCorrecto = texto.replaceAll(patron, "");
        }
        System.out.println(texto);
        System.out.println(textoCorrecto);
    }
   
   
   public static void ejemplo10() {
        String cadena = "";
        String patron = "([1-9]|0[1-9]|1[0-9]|2[0-9]|3[01])";
        boolean correcto;
        do {
            System.out.print("Ingrese algo: ");
            cadena = scan.nextLine();  
            correcto = cadena.matches(patron);
            if(!correcto)
            System.out.println("no cumple con el patron. Vuelva a probar.");    
        }while(!correcto);
    
    }
   
   public static void ejemplo11() {
        String cadena = "";
        String patron = "(191[6-8]|200[0123])";
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena: ");
            cadena = scan.next();  
            correcto = cadena.matches(patron);
            if(!correcto)
            System.out.println("No cumple con el patron. Vuelva a probar.");    
        }while(!correcto);
    }
   
   //Generador de contraseña verificando un patorn
   public static void ejemplo12() {
       String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
       int longitud = simbolos.length(); 
       char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
       String clave = "";
       String patron = "[A-ZÑ]{8}";
       
       for(int i=0; i<8; i++){
           int numeroAleatorio = (int)(Math.random()*longitud);
           char letra = simbolos.charAt(numeroAleatorio); //simbolos.charAt(numeroAleatorio) + "";
           System.out.print(letra + " ");
           password[i] = letra;
           }
           clave = String.valueOf(password);
           if(clave.matches(patron)){
               System.out.println(clave + " Clave incorrecta");
           }else{
               System.out.println(clave + " Clave correcta");
            }
   }
   
   //Generador de contraseña respetando un patorn
   public static void ejemplo13() {
       String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
       int longitud = simbolos.length(); 
       char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
       String clave = "";
       String patron = "[A-ZÑ]{8}";
       
       
       do{
       for(int i=0; i<8; i++){
           int numeroAleatorio = (int)(Math.random()*longitud);
           char letra = simbolos.charAt(numeroAleatorio); //simbolos.charAt(numeroAleatorio) + "";
           System.out.print(letra + " ");
           password[i] = letra;
           }
           System.out.println();
           clave = String.valueOf(password);
       }while(clave.matches(patron));
           System.out.println("\nLa clave es: " + clave);     
   }
   
   //Generador de constraseña cumpliendo el patron y que tenga minimo 8 maximo 12
   public static void ejemplo14() {
       String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
       int[] tamanio = {8,9,10,11,12}; //[0 1 2 3 4]
       int tamanioAleatorio = (int)(Math.random()*tamanio.length);
       int longitud = simbolos.length(); 
       char[] password = new char[tamanio[tamanioAleatorio]];
       String clave = "";
       String patron = "[A-ZÑ0-9]{"+tamanio[tamanioAleatorio]+"}";
       
       do{
       for(int i=0; i<tamanio[tamanioAleatorio]; i++){
           int numeroAleatorio = (int)(Math.random()*longitud);
           char letra = simbolos.charAt(numeroAleatorio); //simbolos.charAt(numeroAleatorio) + "";
           //System.out.println(letra + " ");
           password[i] = letra;
           }
           
           clave = String.valueOf(password);
       }while(clave.matches(patron));
           System.out.println("La clave es: " + clave);     
   }
   
   //[+-][-0-9]+
   
}