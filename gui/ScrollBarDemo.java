package gui;

import java.awt.*;
import java.awt.event.*;

class ColorMaker extends Frame implements AdjustmentListener{
    
    Scrollbar red,green,blue;
    TextField tf;

    public ColorMaker(){

        super("Color Maker");

        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        
        tf = new TextField(20);
        
        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,300,30);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        setLayout(null);

        add(tf);
        add(red);
        add(green);
        add(blue);

    }
    public void adjustmentValueChanged(AdjustmentEvent e) {
      
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
    }
}
    public class ScrollBarDemo {
    
    public static void main(String[] args) {
        
        ColorMaker cm = new ColorMaker();

        cm.setSize(500,500);
        cm.setVisible(true);

    }
}
