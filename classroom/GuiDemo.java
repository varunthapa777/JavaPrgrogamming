package classroom;

import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame{

    Label lb_num1, lb_num2, lb_sum;

    TextField tf_num1, tf_num2, tf_sum;

    Button bt_add;


    MyApp(){

        super("My Application");
        lb_num1 = new Label("NUM1: ");
        lb_num2 = new Label("NUM2: ");
        lb_sum = new Label("   SUM: ");

        tf_num1 = new TextField(20);
        tf_num2 = new TextField(20);
        tf_sum = new TextField(20);

        bt_add = new Button("Add");


        setLayout(new FlowLayout());

        add(lb_num1);
        add(tf_num1);
        add(lb_num2);
        add(tf_num2);
        add(lb_sum);
        add(tf_sum);
        add(bt_add);

         bt_add.addActionListener((ActionEvent ae)->{

            try{
                Float n1 = Float.parseFloat(tf_num1.getText());
                Float n2 = Float.parseFloat(tf_num2.getText());
                tf_sum.setText((n1+n2)+"");
                
            }catch(Exception e){tf_sum.setText("Invalid Input");}

            
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    }



}

public class GuiDemo {
    
    public static void main(String[] args) {
         
        MyApp obj = new MyApp();

        obj.setSize(300,300);
        obj.setVisible(true);
    }
}
