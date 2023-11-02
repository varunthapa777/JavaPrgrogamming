package gui.layout;

import java.awt.*;

class BFrame extends Frame{

    Button b1,b2,b3,b4,b5,b6;

    public BFrame(){

        super("Bordered Demo");
        
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        
        add(b1,BorderLayout.NORTH);
        // add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("One"));
        p.add(new Button("Two"));
        p.add(new Button("Three"));
        add(p,BorderLayout.EAST);
    }
}

public class BorderdLayoutDemo {
    
    public static void main(String[] args) {
         
        BFrame mf = new BFrame();

        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
