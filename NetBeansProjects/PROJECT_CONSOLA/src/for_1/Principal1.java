package for_1;

public class Principal1 {

    public static void main(String[] args) {
        int[] enteros ={3, 2, 1, 4};
        for(int i=0; i<enteros.length; i++) {
            System.out.println(i + "\t" + enteros[i]);
        }
        Object[] datos = {"Mihai",33,1.78,true,'H'};
        for(int i=0; i<datos.length; i++) {
            System.out.println(i + "\t" + datos[i]);
        }   
    }
}
