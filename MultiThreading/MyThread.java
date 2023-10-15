package MultiThreading;


public class MyThread extends Thread {

    public void run(){
        
        int i=0;
        while(true){
            System.out.println(i+ ": Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        
        MyThread th = new MyThread();
        int i=0;
        th.start();
        while(true){

            System.out.println(i+ ": World");
            i++;
        }
    }
}
