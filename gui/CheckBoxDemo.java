package gui;

import java.awt.*;
import java.awt.event.*;

class MiApp extends Frame implements ItemListener{

    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    public MiApp(){

        super("CheckBox Demo");
        l = new Label("Choose Something!");
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Java",false,cbg);
        c2 = new Checkbox("Python",false,cbg);
        c3 = new Checkbox("C++",false,cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);


    }


    public void itemStateChanged(ItemEvent e) {
        
        String str = "";
        if(c1.getState())
        str += " "+c1.getLabel();
        if(c2.getState())
        str += " "+c2.getLabel();
        if(c3.getState())
        str += " "+c3.getLabel();
        if(str.isEmpty())
        str += "Choose Something!";
        l.setText(str);


    }

    
}

public class CheckBoxDemo {
    public static void main(String[] args) {
    
        MiApp ma = new MiApp();

        ma.setSize(500,400);
        ma.setVisible(true);
    }

}
