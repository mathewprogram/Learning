package array;

public class Principal1 {

    static int[][] matriz = {
            {1,2,3},  //(0,0) (0,1) (0,2)
            {4,5,6},  //(1,0) (1,1) (1,2)  
            {7,8,9}   //(2,0) (2,1) (2,2)  
        };//3*3
    
    public static void main(String[] args) {
        ejemplo11();
    }
    
    //Mostrar la diagonal
    public static void ejemplo1(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(i==j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void ejemplo2(){
        for(int i=0; i<matriz.length; i++){
            int j = matriz.length - 1 - i;
                    System.out.print(matriz[i][j] + " ");
                System.out.println();
            }
        }
    
    public static void ejemplo3(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[0].length; j++){
                if(i>=j){
                    System.out.print(matriz[i][j] + " ");
                    }
                }
            System.out.println();
            }
        }
    
    public static void ejemplo4(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[0].length; j++){
                if(j>i){
                    System.out.print(matriz[i][j] + " ");
                    }
                }
            System.out.println();
            }
        }
    
    
    public static void ejemplo5(){
        System.out.println("Forma 1");
        for(int i=0; i<1; i++){
            for(int j=0; j< matriz[0].length; j++){
                if(j>=i){
                    System.out.print(matriz[i][j] + " ");
                    }
                }
            System.out.println();
            }
        
        
        System.out.println("Forma 2");
        for(int j=0; j<matriz[0].length; j++){
                    System.out.print(matriz[0][j] + " ");
        }
            System.out.println();
            }

    //Cambiar los elementos de la matriz: los pares por 1 y los impares por 0 y mostrarlos.
    public static void ejemplo6(){
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[0].length; j++){
                if(matriz[i][j] % 2 == 0){
                    matriz[i][j] = 1; //cambiar pares por 1
                    }else{
                    matriz[i][j] = 0; //cambiar impares por 0
                    }
                System.out.print(matriz[i][j] + " ");
                }
            System.out.println();
            }
        }    
    
    //Mostrar una matriz por columnas
    public static void ejemplo7(){
        
        System.out.println("Recorrer por filas");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Recorrer por columnas");
        for(int j=0; j< matriz[0].length; j++){//filas
            for(int i=0; i<matriz.length; i++){//columnas
                System.out.print(matriz[i][j] + " ");
                }
            System.out.println();
            }
        }    
    
    //Mostrar la suma de cada fila y cada columna
    public static void ejemplo8(){
        
        System.out.println("Recorrer por filas");
        System.out.println("---------------------");
        System.out.println();
        for(int i=0; i<matriz.length; i++){
            int sumaFila = 0;
            for(int j=0; j< matriz[0].length; j++){
                sumaFila += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("Suma de la fila " + i + ": " + sumaFila);
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Recorrer por columnas");
        System.out.println("---------------------");
        System.out.println();
        int sumaTotal = 0;
        for(int j=0; j< matriz[0].length; j++){//filas
            int sumaColumna = 0;
            for(int i=0; i<matriz.length; i++){//columnas
                sumaColumna += matriz[i][j];
                System.out.print(matriz[i][j] + " "); 
                }
            sumaTotal += sumaColumna;
            System.out.print("Suma de la columna " + j + ": " + sumaColumna);
            System.out.println();
            }
        System.out.println();
        System.out.print("Suma total: " + sumaTotal);
        System.out.println();
        System.out.println();
        }
    
    public static void ejemplo9(){
        
        int sumaf = 0, sumac = 0, sumat = 0;
        
        System.out.println();
        System.out.println("Recorrer por filas");
        for(int i=0; i<matriz.length; i++){
            sumaf = 0;
            for(int j=0; j< matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
                sumaf += matriz[i][j];
            }
            System.out.print("Fila " + i + ": " + "Suma = " + sumaf);
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Recorrer por columnas");
        for(int j=0; j< matriz[0].length; j++){//filas
            sumac = 0;
            for(int i=0; i<matriz.length; i++){//columnas
                System.out.print(matriz[i][j] + " ");
                sumac += matriz[i][j];
                sumat += matriz[i][j];
                }
            System.out.print("Columna: " + j + ": " + "Suma = " + sumac);
            System.out.println();
            }
        System.out.println();
        System.out.println("Total: " + sumat);
        System.out.println();
        } 
    
    public static void ejemplo10(){
        
        int sumaf = 0, sumac = 0, sumat = 0;
        
        System.out.println();
        System.out.println("      Matriz:");
        System.out.println();
        for(int i=0; i<matriz.length; i++){
            sumaf = 0;
            for(int j=0; j< matriz[0].length; j++){
                System.out.printf("%4d", matriz[i][j]);
                sumaf += matriz[i][j];
            }
            System.out.printf("%4d", sumaf);
            System.out.println();
        }
        for(int j=0; j< matriz[0].length; j++){//filas
            sumac = 0;
            for(int i=0; i<matriz.length; i++){//columnas
                sumac += matriz[i][j];
                sumat += matriz[i][j];
                }
            System.out.printf("%4d", sumac);
            }
        System.out.printf("%4d",sumat);
        System.out.println();
        System.out.println();
        } 
    
    public static void ejemplo11(){
        
        int sumaf = 0, sumac = 0, sumat = 0;
        int[] vectorf = {0,0,0};
        int[] vectorc = {0,0,0};
        
        System.out.println();
        System.out.println("      Matriz:");
        System.out.println();
        
        for(int i=0; i<matriz.length; i++){
            sumaf = 0;
            for(int j=0; j< matriz[0].length; j++){
                sumaf += matriz[i][j];
            }
            vectorf[i] = sumaf;
        }
        for(int j=0; j< matriz[0].length; j++){//filas
            sumac = 0;
            for(int i=0; i<matriz.length; i++){//columnas
                sumac += matriz[i][j];
                sumat += matriz[i][j];
                }
            vectorc[j] = sumac;
            }
        
    for (int i= 0; i<matriz.length; i++){//fila
        for(int j= 0; j<matriz[0].length; j++){//columna
            System.out.printf("%4d", matriz[i][j]);
        }
        System.out.printf("%4d\n",vectorf[i]);
    }
    for (int i= 0; i<vectorc.length; i++){
            System.out.printf("%4d", vectorc[i]);
        }
        System.out.printf("%4d\n",sumat);
    }
    
}
    
    
    
    

