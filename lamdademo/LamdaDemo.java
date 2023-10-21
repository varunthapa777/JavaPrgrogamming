package lamdademo;

@FunctionalInterface
interface MyLamda{

    public void display();
}
/* 
class My implements MyLamda{

    public void display(){

        System.out.println("Hello World");
    }
}
*/
public class LamdaDemo {
 
public static void main(String[] args) {
    
    MyLamda m = ()->{System.out.println("Hello World");};

    m.display();




}    

}
