package swing;

import java.awt.Container;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaOutput extends javax.swing.JFrame{
    
    Container container = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scroll = new JScrollPane();
    
    
    
    public VentanaOutput(){
       Metodos.personalizarVentana(this);
       Metodos.personalizarJTextArea(txaContenido, scroll);
       container.add(scroll);
       this.setVisible(true);
    }
    
    
    public static void main(String [] args){
        VentanaOutput vo = new VentanaOutput();
    }
    
    
}
