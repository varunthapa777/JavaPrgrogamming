package genericdemo;

public class MethodDemo {
    
    static <T> void display(T obj){

        System.out.println(obj);
    }

    static void show(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        
        display("Hello");
        display(10);
        display(12.5f);

        show("hello");

    }
}
