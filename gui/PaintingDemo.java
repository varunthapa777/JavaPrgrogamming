package gui;

import java.awt.*;
import java.awt.event.*;

class PFrame extends Frame {

    int x, y;
    Graphics g;

    PFrame() {

        super("Painting Demo");
        addMouseMotionListener(new MouseAdapter() {

            public void mouseMoved(MouseEvent e) {

                x = e.getX();
                y = e.getY();
                repaint();

            }
        });

        addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.setFont(new Font("Great Vibes",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
}

public class PaintingDemo {

    public static void main(String[] args) {

        PFrame pf = new PFrame();

        pf.setSize(500, 500);
        pf.setVisible(true);
    }

}
