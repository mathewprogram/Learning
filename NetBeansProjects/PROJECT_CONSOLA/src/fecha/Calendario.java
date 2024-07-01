package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendario {
    
    //Variables de instancia
    private int year;
    private int mes;
    
    //Constructores
    public Calendario(){
        this.year = 0;
        this.mes = 0;
    }
    
    public Calendario(int year, int mes){
        this.year = year;
        this.mes = mes;
    }
    
    public Calendario(int year){
        this.year = year;
    }
    
    //Metodos set y get

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Calendario{" + "year=" + year + ", mes=" + mes + '}';
    }
    
    
    public int obtenerDiasSemanaPrimerDiaMesNumero() {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();
        int diaSemanaNumero = diaSemanaTexto.getValue();
        return diaSemanaNumero - 1;
    }
    
    public int obtenerNumeroDiasMes() {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        return fecha.lengthOfMonth();
    }
    
    
    
    
    
}
