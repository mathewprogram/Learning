package dynamicwindow;

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class DynamicWindow extends JFrame {
    
    
    Container container = getContentPane();
    JTextArea txaContent = new JTextArea();
    JScrollPane sp = new JScrollPane();
    String title;
    
    public DynamicWindow(String title){
        this.title = title;
        personalizeTextArea();
        personalizeWindow();
        setVisible(true);
        setupKeyListener();
        scanAndDisplay();
    }
    
    public void personalizeTextArea(){
        txaContent.setBackground(Color.orange);
        txaContent.setFont( new Font("Courier New", Font.BOLD, 12));
        txaContent.setForeground(Color.black);
        sp.setViewportView(txaContent);
        container.add(sp);
    }
    
    public void personalizeWindow(){
        this.setTitle(title);
        this.setSize(90,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public JTextArea getTextArea(){
        return this.txaContent;
    }
    
    public void setupKeyListener() {
        txaContent.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER){
                txaContent.setText("");
                numbers();
               }
             }
            });
        }
    
    public void scanAndDisplay(){
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.print("Press Enter: ");
        System.out.println();
        txaContent.append("Press Enter:\n");
        input = scan.nextLine();
        txaContent.append(input);
        
        
        numbers();
    }
    
    public void numbers(){
        int n = 10;
        
        for(int i=0; i<n; i++){
        System.out.println(i);
        txaContent.append(i + "\n");
        }
    }
    
    public static void main(String[] args) {
        DynamicWindow dw = new DynamicWindow("Window");
    }
    
}
