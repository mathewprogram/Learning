package array;

public class Principal {

    public static void main(String[] args) {
        tiposArray();
    }
    
    public static void tiposArray(){
        //Vector (Array Unidimensional)
        System.out.println("Vector (Array Unidimensional)");
        System.out.println("----------------------------------------");
        int[] vector = {1,2,3}; //3
        for(int i=0; i<vector.length;i++){
        System.out.print(vector[i] + " ");
        }
        System.out.println();
        
        //Matriz (Array bidimensional)
        System.out.println();
        System.out.println("Vector (Array Biidimensional)");
        System.out.println("----------------------------------------");
        int[][] matriz = {
            {4,5,6},
            {7,8,9}
        };//2*3 (fila*columna)
        for(int i=0; i<matriz.length;i++){//fila
            for(int j=0; j<matriz[i].length;j++){//columna
            System.out.print(matriz[i][j] + " ");
        }
            System.out.println();
        }
        System.out.println();
        
        
        //Cubo (Array Tridimensional)
        System.out.println();
        System.out.println("Cubo (Array de tres dimensiones)");
        System.out.println("----------------------------------------");
        int[][][] cubo = {
        {
            {10,11,12},
            {13,14,15}
        },
        {
            {16,17,18},
            {19,20,21}
        }                
        }; //2*3*2 (fila*columna*matriz)
        for(int i=0; i<cubo.length; i++){ //fila
            for(int j=0; j<cubo[i].length; j++){ //columna
                for(int k=0; k<cubo[i][j].length; k++){ //matriz
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Tesseracto (Array de cuatro dimensiones)");
        System.out.println("----------------------------------------");
        int[][][][] tesseracto = {
            {
             {
            {22,23,24},
            {25,26,27}
        },
        {
            {28,29,30},
            {31,32,33}
        },   
         {
            {34,35,36},
            {37,38,39}
        },
        {
            {40,41,42},
            {43,44,45}
        }       
            }
        };
        for(int i=0; i<tesseracto.length; i++){ //fila
            for(int j=0; j<tesseracto[i].length; j++){ //columna
                for(int k=0; k<tesseracto[i][j].length; k++){ //matriz
                    for(int l=0; l<tesseracto[i][j][k].length; l++){ //cubo
                        System.out.print(tesseracto[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        
        
    }
    
    
}
