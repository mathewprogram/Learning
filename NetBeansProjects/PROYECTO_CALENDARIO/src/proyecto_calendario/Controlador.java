package proyecto_calendario;

import javax.swing.JTextArea;


public class Controlador {
    
    public static void mostrarCalendarioDeUnMes() {
        System.out.println("(1) MOSTRAR EL CALENDARIO DE UN MES");
        System.out.println("-----------------------------------");
        
        
        int year = Entrada.leerYear("INGRESAR YEAR: ");//[1900-2099]
        int mes = Entrada.leerMes("INGRESAR MES: ");//[1-12]
        
        Calendario calendario = new Calendario(year,mes);
        int[][] matriz = calendario.obtenerMatrizMes();
        
        VentanaSalida vs = new VentanaSalida("Mes");
        JTextArea txaContenido = vs.getTextArea();
        
        Calendario.imprimirMatriz(matriz, txaContenido);
        
        
    }
    
    /*public static void mostrarCalendarioDeUnAnio() {
        System.out.println("(1) MOSTRAR EL CALENDARIO DE UN AÑO");
        System.out.println("-----------------------------------");
        
        
        int year = Entrada.leerYear("INGRESAR YEAR: ");//[1900-2099]
        int mes = Entrada.leerMes("INGRESAR MES: ");//[1-12]
        
        Calendario calendario = new Calendario(year,mes);
        int[][][] cubo = calendario.obtenerCuboYear();
        
        VentanaSalida vs = new VentanaSalida("Año");
        JTextArea txaContenido = vs.getTextArea();
        
        Calendario.imprimirMatriz(cubo, txaContenido);
            
    }*/
    
    
}
