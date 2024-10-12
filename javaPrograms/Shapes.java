import javax.swing.*;
import java.awt.*;

class Shapes extends JPanel {
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLUE);
        g2d.drawLine(50, 50, 200, 50);

        g2d.setColor(Color.GREEN);
        g2d.drawRect(50, 80, 150, 100);

        g2d.setColor(Color.YELLOW);
        g2d.fillRect(50, 80, 150, 100);

        g2d.setColor(Color.RED);
        g2d.drawOval(50, 200, 150, 100);
        g2d.setColor(Color.CYAN);
        g2d.fillOval(50, 200, 150, 100);

        int[] xP = {250, 300, 350};
        int[] yP = {300, 200, 300};
        g2d.setColor(Color.MAGENTA);
        g2d.drawPolygon(xP, yP, 3);
        g2d.setColor(Color.ORANGE);
        g2d.fillPolygon(xP, yP, 3);

        g2d.setColor(Color.PINK);
        g2d.drawRoundRect(250, 350, 150, 100, 20, 20);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawRoundRect(250, 350, 150, 100, 20, 20);
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Shapes");
        Shapes panel = new Shapes();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(panel);
        frame.setVisible(true);
    }
}