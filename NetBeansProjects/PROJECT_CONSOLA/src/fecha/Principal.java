package fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        ejemplo7();
    }
    
    //Recuperar la fecha actual del sistema y formatearla
    public static void ejemplo1(){
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String fechaFormato = fechaActual.format(formato);
        System.out.println(fechaFormato);
        
    }
    
    //Obtener el dia de inicio del mes
    public static void ejemplo2(){
        LocalDate diaMes = LocalDate.of(1991, 1, 17);
        System.out.println(diaMes.getDayOfWeek());
    }
    
    //Obtener el numero de dias del mes
    public static void ejemplo3(){
        LocalDate diasTotalMes = LocalDate.of(2024, 5, 1);
        System.out.println("Número total dias del mes: " + diasTotalMes.lengthOfMonth());
    }
    
    //Crear una tabla con la cantidad de dias de cada mes
    public static void ejemplo4(int year){
        System.out.println("Año: " + year);
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        System.out.printf("%-12s %4s %6s\n", "Descripcion", "Mes", "Dias");
        System.out.printf("%-12s %4s %6s\n", "------------", "---", "----");
        
        for (int mes=1; mes<=12; mes++){
            System.out.printf("%-12s %4d %6d\n",meses[mes-1],mes,obtenerNumeroDeDiasDeUnMes(mes,year));
        }
    }
    
    //Crear una tabla con la cantidad de dias de cada un mes
    public static void ejemplo5(){
        int totalDias = obtenerNumeroDeDiasDeUnMes(2,2024);
        for (int dia = 1; dia <= totalDias; dia++){
            System.out.print(dia + " ");
        }
        System.out.println();
        System.out.println();
    }
    
    //Crea una tabla con la cantidad de dias de cada mes donde el año sea aleatorio
    public static void ejemplo6(){
        int year = (int)(Math.random() * 125 + 1900); //[1900,2024] 
        ejemplo4(year);
    }
    
    public static void ejemplo7(){
        int year = (int)(Math.random() * 125 + 1900);
        System.out.println("Año: " + year);
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        System.out.printf("%-12s %4s %6s   %-12s\n", "Descripcion","Mes","Numero","Dia semana");
        System.out.printf("%-12s %4s %6s   %-12s\n","------------","---","----","----------");
        
        
        for (int mes=1; mes<=12; mes++){
            int diasDelMes = obtenerNumeroDeDiasDeUnMes(mes, year);
            LocalDate primerDiaDeLMes = LocalDate.of(year,mes,1);
            String diaDeLaSemana = primerDiaDeLMes.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es"));
            System.out.printf("%-12s %4d %6d  %-12s\n",meses[mes-1],mes,obtenerNumeroDeDiasDeUnMes(mes,year),diaDeLaSemana);
        }
    }
    
    //Obtener numero de dias de un mes
    public static int obtenerNumeroDeDiasDeUnMes(int numeroMes, int year){
        LocalDate diasTotalMes = LocalDate.of(year, numeroMes, 1);
        return diasTotalMes.lengthOfMonth();
    }
    
    
}
