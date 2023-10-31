package gui;

import java.awt.*;
import java.awt.event.*;

class EditText extends Frame implements ActionListener{

    TextArea ta;
    TextField tf;
    Button btn;
    Label l;

    public EditText(){

        super("My Text Editor");
        ta = new TextArea(10,30);
        l = new Label("No Text Entered");
        btn = new Button("ok");
        tf = new TextField(20);

        btn.addActionListener(this);
        btn.setActionCommand("btn-click");
        
        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(btn);

    }

  
    public void actionPerformed(ActionEvent e) {
        
        ta.insert(tf.getText(),ta.getCaretPosition());
        tf.setText("");

        l.setText(ta.getSelectedText());
        
        
    


    }


}

public class TextAreaDemo {
    
    public static void main(String[] args) {
         
        EditText et = new EditText();

        et.setSize(600,500);
        et.setVisible(true);

    }

}
