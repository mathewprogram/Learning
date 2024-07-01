
package misrc;

public class Principal8 {


    public static void main(String[] args) {
        //Las 5 notas de un alumno
        
        /*
        double n1 = 5.6;
        double n2 = 5.6;
        double n3 = 8.1;   = double[] nota = {5.6, 5.6, 8.1, 5.3, 5.7}; // Vector
        double n4 = 5.3;
        double n5 = 5.7;
        */
        
                       // 0    1    2    3    4
        double[] nota = {5.6, 5.6, 8.1, 5.3, 5.7}; // Vector
        System.out.println("Nota 1: " + nota[0]);
        try {
            System.out.println("Nota 6: " + nota[5]);//Es un error semantico
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("indice 5 no existe!");
        }
        //Ejemplo 2: Recorrer un array (promedio = suma//5)
        double suma = 0.0;
        for(int i=0; i<nota.length; i++){
            if(i % 2 == 0){
            suma = suma + nota[i];
            }
        }
        System.out.println("Promedio: " + suma/nota.length);
        
        suma = 0;
        for(double n: nota) { //lo que en otros lenguajes es un foreach  = en java es for con esta sintaxis
            suma = suma + n;
        }
        System.out.println("Promedio: " + suma/nota.length);
        
        suma = nota[0] + nota[1] + nota[2] + nota[3] + nota[4];
        System.out.println("Promedio: " + suma/nota.length);
    }
    
}
