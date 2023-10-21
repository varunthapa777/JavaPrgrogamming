package lamdademo;

@FunctionalInterface
interface MeLamda
{
    public void display(String s);
}


public class MethodRefDemo {

    public MethodRefDemo(String s){
        System.out.println(s.toUpperCase());
    }
    
    public static void reverse(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void greet(String name){

        System.out.println("Hola! Amigo "+name);
    }

    public static void main(String[] args) {

        // // built-in method as reference
        // MeLamda ml = System.out::println;//println is a static method 

        // ml.display("Hello");

        // //static method as reference
        // MeLamda ml2 = MethodRefDemo::reverse;

        // ml2.display("Varun");

        // // non-static method as reference
        // MethodRefDemo md = new MethodRefDemo();

        // MeLamda ml3 = md::greet;

        // ml3.display("Varun");

        // //constructor as refernce
        // MeLamda ml4 = MethodRefDemo::new;

        // ml4.display("Hello World");



    }
}
