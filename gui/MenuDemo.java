package gui;

import java.awt.*;
import java.awt.event.*;

class MFrame extends Frame{

    Menu file,sub;
    
    MenuItem open,save,close,closeAll;

    CheckboxMenuItem autoSave;

    TextField tf;

    MenuBar mb;

    MFrame(){

        super("Menu Bar Demo");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("CloseAll");
        autoSave = new CheckboxMenuItem("AutoSave");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(autoSave);

        sub.add(close);
        sub.add(closeAll);

        mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb); 

        setLayout(null);

        tf = new TextField(40);
        tf.setBounds(180,100,100,20);
        add(tf);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeAll.addActionListener((ActionEvent ae) -> tf.setText("CloseAll"));
        
        autoSave.addItemListener((ItemEvent ie)->{
            if(autoSave.getState())
            tf.setText("AutoSave : On");
            else
            tf.setText("AutoSave : Off");
        });

    }


}

public class MenuDemo {
    
    public static void main(String[] args) {
        
        MFrame obj = new MFrame();

        obj.setSize(500,500);
        obj.setVisible(true);
    }

}
