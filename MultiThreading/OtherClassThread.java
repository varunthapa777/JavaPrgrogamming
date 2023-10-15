package MultiThreading;


public class OtherClassThread {
    
    public static void main(String[] args) {
        MyThread th =  new MyThread();
        
        int i = 0;
        th.start();
        while(true){

            System.out.println(i+ ": World");
            i++;

        
    }

    }

}
