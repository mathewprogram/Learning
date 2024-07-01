package swing;

public class Principal {

    public static void main(String[] args) {
        imprimir();
    }
    
    public static void imprimir(){
        for(int i=0; i<1; i++){
            Ventana v = new Ventana();
            v.setVisible(true);
            System.out.println("hola mundo");
        }
    }
    
}
