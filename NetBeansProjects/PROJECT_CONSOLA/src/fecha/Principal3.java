package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal3 {

    public static void main(String[] args) {
        
        int[][][] cubo = new int[12][6][7]; //matriz, fila, columnas
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] diaSemana = {"L", "M", "X", "J", "V", "S", "D"};
        
        for (int m = 0; m < 12; m++) {
            int diasSemana = obtenerDiasSemanaPrimerDiaMesNumero(m + 1, 2024);
            int numeroDias = obtenerNumeroDiasMes(m + 1, 2024);
            int numeroDiasMesAnterior = (m == 0) ? obtenerNumeroDiasMes(12, 2023) : obtenerNumeroDiasMes(m, 2024);
            int indice = 1;
            boolean bandera = false;
            
            // Días del mes anterior en rojo
            for (int i = diasSemana - 1; i >= 0; i--) {
                cubo[m][0][i] = -numeroDiasMesAnterior--;
            }
            
            // Días del mes actual
            for (int i = 0; i < cubo[0].length; i++) {
                for (int j = (i == 0) ? diasSemana : 0; j < cubo[0][0].length; j++) {
                    if (indice <= numeroDias) {
                        cubo[m][i][j] = indice++;
                    } else {
                        bandera = true;
                        break;
                    }
                }
                if (bandera) break;
            }
            
            // Días del mes siguiente en rojo
            int siguienteDia = 1;
            for (int i = 0; i < cubo[0].length; i++) {
                for (int j = 0; j < cubo[0][0].length; j++) {
                    if (cubo[m][i][j] == 0) {
                        cubo[m][i][j] = -siguienteDia++;
                    }
                }
            }
        }
        
        for (int i = 0; i < cubo.length; i++) {
            System.out.println();
            System.out.println("   " + "-------------------------------");
            System.out.println("   " + mes[i] + " 2024");
            System.out.println("   " + "-------------------------------");
            System.out.println();
            System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", (Object[])diaSemana); //tambien puede ser solo diaSemana en vez de (Object[])diaSemana
            System.out.println();
            for (int j = 0; j < cubo[0].length; j++) {
                for (int k = 0; k < cubo[0][0].length; k++) {
                    if (cubo[i][j][k] < 0) {
                        System.out.printf("\033[31m%4d\033[0m ", -cubo[i][j][k]); // Color rojo para días fuera del mes
                    } else {
                        System.out.printf("%4d ", cubo[i][j][k]);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static int obtenerDiasSemanaPrimerDiaMesNumero(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();
        int diaSemanaNumero = diaSemanaTexto.getValue();
        return diaSemanaNumero - 1;
    }
    
    public static int obtenerNumeroDiasMes(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.lengthOfMonth();
    }
}
