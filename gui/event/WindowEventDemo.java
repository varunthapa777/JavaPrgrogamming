package gui.event;

import java.awt.*;
import java.awt.event.*;


class WindowApp extends Frame implements WindowListener{

    Label l;
    WindowApp(){

        super("Window Demo");
        
        l = new Label();

        setLayout(null);

        l.setBounds(30,50,200,50);
        add(l);
        addWindowListener(this);

    }

    
    public void windowOpened(WindowEvent e) {
        
        l.setText("Window Opended");
    }
    
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }
    
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }
    
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }
    
    public void windowDeiconified(WindowEvent e) {
       l.setText("Window Deiconified");
    }

    
    public void windowActivated(WindowEvent e) {
        
        l.setText("Window Activated");
    }
   
    public void windowDeactivated(WindowEvent e) {
       
        l.setText("Window Decativated");
    }

    

}

public class WindowEventDemo {
 
    public static void main(String[] args) {
        
        WindowApp wa = new WindowApp();

        wa.setSize(500,500);
        wa.setVisible(true);
    }
}
