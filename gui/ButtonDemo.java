package gui;

import java.awt.*;
import java.awt.event.*;;

class Clicker extends Frame implements ActionListener{

    int count = 0;
    Button btn;
    Label l;

    public Clicker(){

        super("Click Counter");
        btn = new Button("Click");
        btn.addActionListener(this);
        l = new Label(count+"  ");

        setLayout(new FlowLayout());

       add(l);
       add(btn);
    }


    public void actionPerformed(ActionEvent e) {
        
        count++;
        l.setText(count+"  ");
    }

    
}

public class ButtonDemo {
    
 public static void main(String[] args) {
    
    Clicker clk = new Clicker();

    clk.setSize(400,400);
    clk.setVisible(true);
 }

}
