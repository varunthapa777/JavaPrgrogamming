package MultiThreading;

class MyData{

 synchronized public void display(String str){
  
        for(int i=0; i< str.length(); i++){

            System.out.print(str.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }
        
    }
}

class MyThread1 extends Thread{

    MyData d;

    public MyThread1(MyData dat){ d = dat;}

    public void run(){

        d.display("Hello World");
    }
}
class MyThread2 extends Thread{

    MyData data;

    public MyThread2(MyData dat){ data = dat;}

    public void run(){

        data.display("Welcome");
    }
}

public class SyncDemo {
    
    public static void main(String[] args) {
        
        MyData d = new MyData();
        MyThread1 th1 = new MyThread1(d);
        MyThread2 th2 = new MyThread2(d);

        th1.start();
        th2.start();

    }
}
