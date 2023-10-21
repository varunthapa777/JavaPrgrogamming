package lamdademo;

@FunctionalInterface
interface NewLamda{
    public void display();
}

class UseLamda{

    public void callLamda(NewLamda l){ // give Lamda argument

        l.display();
    }
}

class NewDemo{

    public void method2(){

        UseLamda ul = new UseLamda();
        ul.callLamda(()->{System.out.println("Hello Varun");}); // pass Lamda method in the arg
    }
}

public class CaptureInLamda {
    
public static void main(String[] args) {
    
    NewDemo nd = new NewDemo();

    nd.method2();
}

}
