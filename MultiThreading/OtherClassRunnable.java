package MultiThreading;


public class OtherClassRunnable {

    public static void main(String[] args) {
        
        MyRunnable m = new MyRunnable();
        Thread th = new Thread(m);

        int i = 0;
        th.start();

        while(true){

            System.out.println(i+": World");
            i++;
        }

    }
}
