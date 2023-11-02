package gui.event;

import java.awt.*;
import java.awt.event.*;

class MouseTracker extends Frame implements MouseListener , MouseMotionListener{

    Label l1, l2;

    MouseTracker(){

        super("Mouse Listener Demo");
        l1 = new Label("");
        l2 = new Label("");

        setLayout(null);

        l1.setBounds(30,50,100,50);
        l2.setBounds(30,90,100,50);
        
        add(l1);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e){

        l1.setText("Mouse Entered..");
    }

    public void mouseExited(MouseEvent e){

        l1.setText("Mouse Exited...");
    }
    public void mouseMoved(MouseEvent e){

        l2.setText("("+e.getX()+","+e.getY()+")");
    }

    public void mouseClicked(MouseEvent e){

        l1.setText("Mouse Clicked...");
    }

    public void mousePressed(MouseEvent e){
        l1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e){

        l1.setText("Mouse Released..");
    }

    public void mouseDragged(MouseEvent e){

        l1.setText("MouseDragged...");
    }

    

}

public class MouseEventDemo {
    
    public static void main(String[] args) {
        
        MouseTracker mt = new MouseTracker();

        mt.setSize(500,500);
        mt.setVisible(true);
    }

}
