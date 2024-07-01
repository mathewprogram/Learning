package array;

import static fecha.Principal2.obtenerDiaSemanaPrimerDiaMesNumero;
import static fecha.Principal2.obtenerNumeroDiasMes;
import javax.swing.JTextArea;

public class Principal2 {

    public static void main(String[] args) {
        
        //int[][] menero = new int[6][7];
        int[][] menero = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mfebrero = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mmarzo = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mabril = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mmayo = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mjunio = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mjulio = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] magosto = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mseptiembre = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] moctubre = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mnoviembre = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int[][] mdiciembre = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
       
        int[][][] cubo = new int[12][6][7]; //matriz, fila, columnas
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto", 
                        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] diaSemana = {"L" ,"M" ,"X" ,"J" ,"V" ,"S" ,"D"};
        
        cubo[0] = menero;
        cubo[1] = mfebrero;
        cubo[2] = mmarzo;
        cubo[3] = mabril;
        cubo[4] = mmayo;
        cubo[5] = mjunio;
        cubo[6] = mjulio;
        cubo[7] = magosto;
        cubo[8] = mseptiembre;
        cubo[9] = moctubre;
        cubo[10] = mnoviembre;
        cubo[11] = mdiciembre;
        obtenerCuboCalendario(cubo);
        
        for(int i=0; i<cubo.length; i++){  
            mariaDB.VentanaSalida vs = new mariaDB.VentanaSalida("   " + mes[i]);
            JTextArea txaContenido = vs.getTextArea();
            String s;
            System.out.println();
            System.out.println("   " + "-------------------------------");
            System.out.println("   " + mes[i]);
            System.out.println("   " + "-------------------------------");
            System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n",(Object[])diaSemana);//tambien puede ser solo diaSemana en vez de (Object[])diaSemana
            s = String.format("%4s %4s %4s %4s %4s %4s %4s\n",(Object[])diaSemana);
            txaContenido.append(s);
            for(int j=0; j<cubo[0].length; j++){
                for(int k=0; k<cubo[0][0].length; k++){
                    if (cubo[i][j][k] == 0){
                        System.out.printf("%4s ", " ");
                        s = String.format("%4s ", " ");
                        txaContenido.append(s);
                    }else{
                    System.out.printf("%4d ",cubo[i][j][k]);
                    s = String.format("%4d ",cubo[i][j][k]);
                    txaContenido.append(s);
                        }
                    }
                System.out.println();
                s = String.format("\n");
                txaContenido.append(s);
                }
            System.out.println();
            s = String.format("\n");
            txaContenido.append(s);
            }
        
        }
    
    public static void obtenerCuboCalendario(int[][][] cubo){
                
        for(int mes=1; mes<=12; mes++){
            int[][] matrizmes = cubo[mes-1];
            int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero(mes, 2024);
            int numeroDias = obtenerNumeroDiasMes(mes, 2024);
            boolean bandera = false;
            int indice = 1;
            for(int i=0; i<matrizmes.length; i++) {
                for(int j=0; j<matrizmes[0].length; j++) {
                    if(i==0 && j == diaSemana) {
                       bandera = true; 
                    }
                    if(bandera) {
                       matrizmes[i][j] = indice;
                       indice++;
                    }
                    if(indice > numeroDias) {
                        bandera = false;
                        }
                    }
                }
            }
        }
    
    }
    

/*
VentanaSalida vs = new VentanaSalida(titulo);
JTextArea txaContenido = vs.getTextArea();
*/

