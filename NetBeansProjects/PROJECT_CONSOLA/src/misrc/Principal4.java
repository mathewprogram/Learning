
package misrc;

import circulo.Libreria;

public class Principal4 {

    public static void main(String[] args) {
        //char charAt(Int index)
        String texto = "E un puerto italiano";
        char letra = texto.charAt(1);
        
        //static String valueOf(int i)
        int entero = 1234;
        String cadena = String.valueOf(entero);
        
        double numero = 1343.34123876234;
        System.out.println(Libreria.redondear(numero));
        
        Libreria x = new Libreria();
        System.out.println(x.redondear1(numero));
    }
    
}
