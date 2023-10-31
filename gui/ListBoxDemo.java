package gui;

import java.awt.*;
import java.awt.event.*;

class MyList extends Frame implements ItemListener , ActionListener{

    List l;
    Choice c;
    TextArea ta;

    public MyList(){

        super("ListBox Demo");
        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);

        l.add("Monday");
        l.add("Tueday");
        l.add("Wedesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
        setLayout(new FlowLayout());

        add(l);
        add(c);
        add(ta);

    }
  
    public void itemStateChanged(ItemEvent e) {
        
        if(e.getSource() == l){
            ta.setText(l.getSelectedItem());
        }
        if(e.getSource() == c){
            ta.setText(c.getSelectedItem());
        }
    }

   
    public void actionPerformed(ActionEvent e) {
        
        String list[] = l.getSelectedItems();

        String txt = "";
        for(String i : list){

            txt += i+"\n";

        }

        ta.setText(txt);
    }
}

public class ListBoxDemo {
    
    public static void main(String[] args) {
        
        MyList ml = new MyList();

        ml.setSize(500,500);
        ml.setVisible(true);
    }

}
