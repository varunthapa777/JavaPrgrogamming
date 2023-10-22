package inputoutput;

import java.io.*;

class Producer extends Thread{

    OutputStream os;

    public Producer(OutputStream os){
        this.os = os;
    }

    public void run(){

        int count = 0;
        try{
        while(true){
            os.write(count);
            os.flush();
            Thread.sleep(10);
            System.out.println("Produce : "+ count++);

        }

    }catch(Exception e){}
    }
}
class Consumer extends Thread{

    InputStream is;

    public Consumer(InputStream is){
        this.is = is;
    }

    public void run(){

        int x;
        try{
        while(true){
            x = is.read();
            System.out.println("Counsume : "+ x);
            System.out.flush();
            Thread.sleep(10);

        }

    }catch(Exception e){}
    }
}

public class PipedDemo {
    
    public static void main(String[] args) throws Exception {
        
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);
        
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

    }
}
