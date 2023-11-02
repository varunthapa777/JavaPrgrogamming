package gui.event;

import java.awt.*;
import java.awt.event.*;


class AdaptorApp extends Frame{

    AdaptorApp(){

        super("Adaptor class Demo");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    

}

public class AdaptorDemo {
 
    public static void main(String[] args) {
        
        AdaptorApp aa = new AdaptorApp();

        aa.setSize(500,500);
        aa.setVisible(true);
    }
}
