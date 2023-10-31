package gui;

import java.awt.*;
import java.awt.event.*;

class WriteOn extends Frame implements ActionListener, TextListener {

    TextField tf;
    Label l1, l2;
    Button btn;

    WriteOn() {

        super(" Write on Me ");
        tf = new TextField(20);
        l1 = new Label("Text Field is Blank!");
        l2 = new Label("Enter key is not typed yet!");
        btn = new Button("show");
        btn.setActionCommand("password");

        tf.setEchoChar('*');
        tf.addTextListener(this);
        tf.addActionListener(this);
        btn.addActionListener(this);

        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(btn);
        add(l2);
    }

    public void actionPerformed(ActionEvent e) {

        if (tf.echoCharIsSet()) {
            btn.setLabel("hide");
            tf.setEchoChar((char) 0);
        } else {

            btn.setLabel("show");
            tf.setEchoChar('*');
        }
       
        if(e.getActionCommand() != "password")
        l2.setText(tf.getText());
        

    }

    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());

    }

}

public class TextFieldDemo {

    public static void main(String[] args) {

        WriteOn wo = new WriteOn();

        wo.setSize(500, 400);
        wo.setVisible(true);
    }
}
