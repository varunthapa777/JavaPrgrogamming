package swing;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

// import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyText extends JFrame{

    JTextField tf1;
    JFormattedTextField ft1;

    MyText(){

        super("JTextField Demo");

        tf1= new JTextField(20);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        ft1 = new JFormattedTextField(nft);
        ft1.setColumns(20);
        ft1.setValue(0);

        setLayout(new FlowLayout());

        add(tf1);
        add(ft1);
    }

}

public class JTextFieldDemo {
    
    public static void main(String[] args) {
         
        MyText mt = new MyText();

        mt.setSize(300,300);
        mt.setVisible(true);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
