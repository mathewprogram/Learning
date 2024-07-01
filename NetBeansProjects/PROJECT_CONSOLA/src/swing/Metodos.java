package swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Metodos {
    
    public static void personalizarVentana(JFrame vo){
        
        vo.setTitle("GUI SWING");
        vo.setSize(400,300);
        vo.setVisible(true);
        vo.setLocationRelativeTo(null);
        vo.setResizable(false);
        vo.setFont(new java.awt.Font("Courier New", 2, 12));
    }
    
    public static void personalizarJTextArea(JTextArea txaContenido, JScrollPane sp){
        txaContenido.setBackground(Color.white);
        txaContenido.setFont(new Font ("Courier New", Font.BOLD, 14));
        txaContenido.setForeground(Color.orange);
        sp.setViewportView(txaContenido);
    }
}
