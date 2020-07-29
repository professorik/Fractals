package fractal;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 * @author psychocoder
 */
public class L_Systems_Tree extends JPanel {

    private static final long serialVersionUID = 1L;

    public L_Systems_Tree() {

    }

    /*private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0)
            return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 12.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 12.0);
        g.drawLine(x1, y1, x2, y2);
        //try {
         //   Thread.sleep(1000);

           // g.drawRect(50 , 50, 50 , 50);
            System.out.println("kar");
       // }// catch(InterruptedException ex) {
            System.out.println("KAAAAAAAAAAAAAAAAAAAAAAAAAR");
      ///  }
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }*/

    public static void draw(Graphics g, int x, int y, int width, int height , int i) {
        Graphics2D g2 = (Graphics2D) g;
        switch (i){
            case 0:
                g2.setPaint(Color.RED);
                break;
            case 1:
                g2.setPaint(Color.ORANGE);
                break;
            case 2:
                g2.setPaint(Color.YELLOW);
                break;
            case 3:
                g2.setPaint(Color.GREEN);
                break;
            case 4:
                g2.setPaint(Color.CYAN);
                break;
            case 5:
                g2.setPaint(Color.BLUE);
                break;
            case 6:
                g2.setPaint(Color.MAGENTA);
                break;
        }
        Ellipse2D r2 = new Ellipse2D.Float(x,y,width,height);

       // g2.drawOval (x, y, width, height);
        g2.fill(r2);
        if (height == 0) return;
       // g.drawOval (x, y, width, height);
        draw (g, x, y, width/2, height/2, i + 1);
        draw (g, x+width/2, y, width/2, height/2, i + 1);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.DARK_GRAY);
       // drawTree(g, getWidth() / 2, getHeight(), -90, 10);
        draw(g, 0, 0, 1000 , 1000, 0);
    }

    public static void main(String... args) {
        final JFrame frame = new JFrame("L Systems - Tree Fractal");
        frame.setContentPane(new L_Systems_Tree());
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
      /*  SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                frame.setContentPane(new L_Systems_Tree());
                frame.setSize(1000, 700);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });*/
    }
}