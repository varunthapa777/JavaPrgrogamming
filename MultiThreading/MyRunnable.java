package MultiThreading;

public class MyRunnable implements Runnable {
    
    public void run(){
        
        int i=0;
        while(true){
            System.out.println(i+ ": Hello");
            i++;
        }
    }

        public static void main(String [] args){

            MyRunnable m = new MyRunnable();
            Thread th = new Thread(m);
            int i=0;
            th.start();
            while(true){
    
                System.out.println(i+ ": World");
                i++;
            } 
        }
}
