
package misrc;


public class Principal2 {

    public static void main(String[] args) {
        int binario = 100101;
        //PASARLLO A TEXTO
        String sbinario = String.valueOf(binario);//"100101"
        int decimal0 = Integer.parseInt(sbinario.charAt(0)+ "") * (int)Math.pow(2,5);
        int decimal3 = Integer.parseInt(sbinario.charAt(3)+ "") * (int)Math.pow(2,2);
        int decimal5 = Integer.parseInt(sbinario.charAt(5)+ "") * (int)Math.pow(2,0);
        System.out.println("Resultado: " + (decimal0+decimal3+decimal5));
    }
    
}

/*
Math.pow                    POWER                               double
objectToCadena.charAt(0)    Obtener un caracter de la cadena    char
String.valueOf              Convierte numero a cadena           String
*/
