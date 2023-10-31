package gui.layout;

import java.awt.*;

class FlowFrame extends Frame{

    Button b1,b2,b3,b4,b5,b6;

    public FlowFrame(){

        super("FlowLayout Demo");
        
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(25);
        setLayout(fl);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}

public class FlowLayoutDemo {
    
    public static void main(String[] args) {
        

        FlowFrame mf = new FlowFrame();

        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
