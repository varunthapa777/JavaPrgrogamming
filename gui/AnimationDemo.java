package gui;

import java.awt.*;

class AFrame extends Frame implements Runnable{

    int x=100,y=100,tx,ty;
    Thread th;

    AFrame(){

        super("Animation Demo");
        tx = ty = 1;
        th = new Thread(this);
        th.start();


    }

    public void run(){

        while(true){

            if(x < 0 || x >450)
            tx *= -1;
            if(y < 30 || y > 350)
            ty *= -1;


            x += tx;
            y += ty;
            repaint();
           try{ Thread.sleep(10);}catch(Exception e){};
        }

    }
    
    public void paint(Graphics g){

        g.setColor(Color.CYAN);
        g.fillOval(x, y, 50, 50);
    }
}

public class AnimationDemo {

    public static void main(String[] args) {
         
        AFrame af = new AFrame();

        af.setSize(500,400);
        af.setVisible(true);
    }
}
