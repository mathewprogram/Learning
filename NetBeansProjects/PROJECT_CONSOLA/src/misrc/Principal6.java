
package misrc;

public class Principal6 {

    public static void main(String[] args) {
        {//Inicio 1 - while
        System.out.println("while");
        int i = 1;
        int n = 5;
        while(i<=n) {
            System.out.println(i);
            i++; //i=i+1 i+=1 i++ es todo lo mismo
        }
        }//Fin 1
        
        {//Inicio 2 - do...while
        System.out.println("do...while");
        int i = 1;
        int n = 5;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);
        }//Fin 2
        
        {//Inicio 3 - for
        System.out.println("for");
        int n = 5;
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
      }//Fin 3
        
        {//Infinito
            System.out.println("for");
            int i = 1;
            for(;true;) {
                System.out.println(i);
                if(i == 5) {
                    break;
                }
                i++;
            }
        }//"Fin infinito";
        {//for = falso
        System.out.println("for");
        int n = 1;
        for (int i = 5; i < n; i++) {
            System.out.println(i);
        }//no hace nada por el simbolo de mayor que >
    }//fin for falso
        
        {//Inicio decremento
            System.out.print("Decremento ");
            int n= 10;
            for(int i=n; i>=1; i--){
                System.out.print(i + " ");
            }
        }//Fin decremento
        
       /* {//Infinito
            System.out.println("for");
            long n = Long.MAX_VALUE;//MAX_VALUE es una constante;
            int contador = 1;
            for (long i=n; i>1; i=i-1) {
                System.out.print(i + " ");
                if(contador == 5 ) {
                    System.out.println();
                    contador = 1;
                }
              contador++;  
            }
        }*/
       {//Dado aleatorio 100 veces
       for (int i=1; i<= 100; i++){
       int dado = (int)(Math.random() * 6 + 1); 
       System.out.println(dado + " ");
        
       }      
       }//Ex: contar cuantas veces salio cada numero en 
       //     las 100 veces que se lanzo - idea: Case: 1,2,3,4,5,6 
       
       
  }//public static void
}//Principal6      