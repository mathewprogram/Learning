import java.awt.*;
import javax.swing.*;

public class TesseractProjection extends JPanel {
    private static final int SIZE = 600;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Coordenadas de los vértices del tesseracto en 4D
        int[][] vertices = {
            {1, 1, 1, 1}, {1, 1, 1, -1}, {1, 1, -1, 1}, {1, 1, -1, -1},
            {1, -1, 1, 1}, {1, -1, 1, -1}, {1, -1, -1, 1}, {1, -1, -1, -1},
            {-1, 1, 1, 1}, {-1, 1, 1, -1}, {-1, 1, -1, 1}, {-1, 1, -1, -1},
            {-1, -1, 1, 1}, {-1, -1, 1, -1}, {-1, -1, -1, 1}, {-1, -1, -1, -1}
        };

        int scale = SIZE / 4;
        int[][] projected = new int[16][2];
        
        // Proyección 4D a 2D
        for (int i = 0; i < 16; i++) {
            projected[i][0] = SIZE / 2 + (vertices[i][0] + vertices[i][1]) * scale / 2;
            projected[i][1] = SIZE / 2 + (vertices[i][2] + vertices[i][3]) * scale / 2;
        }

        // Dibujar aristas del tesseracto proyectado
        for (int i = 0; i < 16; i++) {
            for (int j = i + 1; j < 16; j++) {
                int dist = 0;
                for (int k = 0; k < 4; k++) {
                    dist += Math.abs(vertices[i][k] - vertices[j][k]);
                }
                if (dist == 2) {
                    g2d.drawLine(projected[i][0], projected[i][1], projected[j][0], projected[j][1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Proyección del Tesseracto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SIZE, SIZE);
        frame.add(new TesseractProjection());
        frame.setVisible(true);
    }
}
