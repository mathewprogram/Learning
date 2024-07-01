package for_1;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Serie: 0.01, 0.02, 0.03, 0.04 ... 0.10");
        int c = 0;
        for(float i=(float) 0.01; i<=1.0f; i=redondear(i+0.01f)) {
            System.out.print(i + "\t");
            c++;
            if(c == 10){
                System.out.println();
                c = 0;
            }
        }
    
    System.out.println("");
    System.out.println("Recorrer Cadena: En un puerto italiano.");
    String texto = "En un puerto italiano.";
    int longitud = texto.length();
    
    for(int i=0; i<longitud; i++){
        System.out.print(texto.charAt(i) + "");
    }
        System.out.println();
        
        System.out.println("Cantidad de vocales en el texto");
        
        String patron = "[AEIOUaeiou]";
        for(int i=0; i<longitud; i++){
            
            String letra = texto.charAt(i) + ""; //conviertes un caracter 'a' en texto "a" 
            if(letra.matches(patron)) { //metodo matches solo funciona con cadenas("texto")
                c++;
            }
            /*
            if((texto.charAt(i) + "").matches(patron)){
                c++;
            }
            if(String.valueOf(texto.charAt(i)).matches(patron)) {
            c++;
            */
        }
        System.out.println("Vocales: " + c);
        System.out.println();
    }
    
    
    public static float redondear(float numero) {
        return (float)(Math.round(numero * 100.0) / 100.0);
    }
    
}
