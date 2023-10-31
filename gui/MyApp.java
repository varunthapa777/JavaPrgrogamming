package gui;

import java.awt.*;
public class MyApp {

    public static void main(String[] args) {
        Frame fm = new Frame("My First App");
        fm.setLayout(new FlowLayout());

        Button btn = new Button("ok");
        Label lb = new Label("Enter Your Name: ");
        TextField tf = new TextField(20);

        fm.add(lb);
        fm.add(tf);
        fm.add(btn);


        fm.setSize(300,300);
        fm.setVisible(true);
    }
    

    
}