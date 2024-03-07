package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MySwing extends JFrame implements ActionListener{

    JLabel l;
    JButton btn,btn2;
    int count = 0;
    MySwing(){

        super("My Swing App");
        l = new JLabel("Clicked "+count+" Times");
        btn = new JButton("Click");
        btn2 = new JButton("Click");
        
        btn.addActionListener(this);
        
        getRootPane().setDefaultButton(btn);//This set btn into Deafult button
        l.setToolTipText("Counter");

        setLayout(new FlowLayout());

        add(l);
        add(btn);
        add(btn2);
    }

    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("Clicked "+count+" Times");
    }

}

public class FirstSwing {
    
    public static void main(String[] args) {
         
        MySwing ms = new MySwing();

        ms.setSize(500,500);
        ms.setVisible(true);
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
