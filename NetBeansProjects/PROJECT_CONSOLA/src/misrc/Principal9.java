package misrc;


public class Principal9 {

    public static void main(String[] args) {
        
        //1. Declaracion de variables - analisis
        double[] vectorsueldo = {1500.50, 1200.30, 900.00, 2500.38, 1800.8, 
                           800.02, 1200.04, 2100.04, 1750.08, 1234.8};
        double nomina = 0; //Acumulador
        
        //2. Proceso
        for(double sueldo: vectorsueldo) {
            nomina = nomina + sueldo;
        }
        
        //3. Salida
        System.out.println("Total Nominas: " + nomina);
        }
    }
   