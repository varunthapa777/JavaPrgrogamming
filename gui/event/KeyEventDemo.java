package gui.event;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class MyFrame extends Frame implements KeyListener{

    Label l1,l2,l3,l4;

    MyFrame(){

        super("Key Event Demo");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        l1.setBounds(50,70,100,20);
        l2.setBounds(50,100,100,20);
        l3.setBounds(50,130,100,20);
        l4.setBounds(50,160,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }

    

    public void keyTyped(KeyEvent e) {
       
        l3.setText("Key Typed...");
        l4.setText(new Date(e.getWhen())+"");
    }
    
    
    public void keyPressed(KeyEvent e) {
        
        l1.setText("Key Pressed...");
        l2.setText("");

    }

 
    public void keyReleased(KeyEvent e) {
       
        l2.setText("Key Released...");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    

}

public class KeyEventDemo {
    public static void main(String[] args) {
        
        MyFrame mf = new MyFrame();

        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
