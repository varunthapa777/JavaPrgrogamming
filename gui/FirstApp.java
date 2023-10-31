package gui;

import java.awt.*;

class MyFrame extends Frame{

    Button btn;
    Label lb;
    TextField tf;

    public MyFrame(){
        
        btn = new Button("ok");
        lb = new Label("Name: ");
        tf = new TextField(20);
        setLayout(new FlowLayout());

        add(lb);
        add(tf);
        add(btn);
        
    }
}

public class FirstApp  {
    
    public static void main(String[] args) {
        
        MyFrame mf = new MyFrame();
        mf.setSize(300,300);
        mf.setVisible(true);
    }
    
}
