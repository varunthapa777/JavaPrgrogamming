package gui.layout;

import java.awt.*;

class GFrame extends Frame{

    Button b1,b2,b3,b4,b5,b6;

    public GFrame(){

        super("GridLayout Demo");
        
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        setLayout(new GridLayout(3,2));

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(new Button("New"));
        
        

    }
}

public class GridLayoutDemo {
    
    public static void main(String[] args) {
         
        GFrame mf = new GFrame();

        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
