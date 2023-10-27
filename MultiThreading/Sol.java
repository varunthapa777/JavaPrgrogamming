package MultiThreading;

class TestX extends Thread{

    int i,ans;

    public void run(){

        i = 10;
        try{
        for(int j=1; j<=10; j++){
            ans = i *j ;
            System.out.println("TestX: "+ans);
            Thread.sleep(1000);
        }
    }catch(Exception e){System.out.println(e);}
    }
}


class TestY extends Thread{

    int i,ans;

    public void run(){

        i = 20;
        try{
        for(int j=1; j<= 10; j++){
            ans = i *j ;
            System.out.println("TestY: "+ans);
            Thread.sleep(1000);
        }
    }catch(Exception e){System.out.println(e);}
    }
}
public class Sol {

    public static void main(String[] args) {
        
        TestX tx = new TestX();
        TestY ty = new TestY();

        tx.start();
        ty.start();
    }
}