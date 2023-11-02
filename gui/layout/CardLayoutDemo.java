package gui.layout;

import java.awt.*;
import java.awt.event.*;

class CFrame extends Frame implements ItemListener{

    Button l1, l2, l3;
    TextField tf1, tf2, tf3;

    Checkbox c1,c2;
    CheckboxGroup cbg;

    Panel cp;
    Panel p1;
    Panel p2;
    Panel mainp;

    CardLayout cl;

    CFrame(){

        super("CardLayout Demo");

        l1 = new Button("one");
        l2 = new Button("Two");
        l3 = new Button("Three");

        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);

        cbg = new CheckboxGroup();

        c1 = new Checkbox("one",true,cbg);
        c2 = new Checkbox("two",false,cbg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);

        p2 = new Panel();
        p2.add(tf1);
        p2.add(tf2);
        p2.add(tf3);

        mainp = new Panel();
        cl = new CardLayout();
        mainp.setLayout(cl);

        mainp.add(p1);
        mainp.add(p2);

        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);

        
    }

    public void itemStateChanged(ItemEvent e){

        if(c1.getState())
        cl.first(mainp);
        else
        cl.last(mainp);
    }

    
}   

public class CardLayoutDemo {
    
    public static void main(String[] args) {
         
        CFrame cf = new CFrame();

        cf.setSize(500,500);
        cf.setVisible(true);
    }

}
