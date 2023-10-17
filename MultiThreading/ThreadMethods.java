package MultiThreading;

class NewThread extends Thread{

    public NewThread(String name){
        super(name);
    }

    public void run(){

    int ctr = 1;

    while(true){

        System.out.println(ctr++);
        // try{

        //     Thread.sleep(1000);
        // }
        // catch(InterruptedException e){
        //     System.out.println(e);
        // }
    }
}
}
public class ThreadMethods {
    

    public static void main(String[] args) {
        
        NewThread t = new NewThread("My Thread 1");
        // Thread class Methods 
        // System.out.println("Id: "+t.threadId());
        // System.out.println("Name: "+t.getName());
        // System.out.println("Priority: "+t.getPriority());
        // System.out.println("State: "+t.getState());
        // System.out.println("Alive: "+t.isAlive());

        //daemon 
        // t.setDaemon(true);
        t.start();

        // try{Thread.sleep(100);}catch(Exception e){}
        
        
        //join
        //Thread mainThread = Thread.currentThread();
        //try{mainThread.join();}catch(Exception e){}


        //yield : gives more time to the thread to run
        // Thread.yield();

    }
}
