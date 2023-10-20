package Reflection;


import java.lang.reflect.*;

class My{

    private int a;
    protected int b;
    public int c;
    int d;

    public My(){}

    public My(int x, int y ){}

    public void display(String s1, String s2){ System.out.println(a);}

    public int show(int x, int y){return 0;}

}
public class ReflectDemo {

    public static void main(String[] args) {
        
       
        Class<My> c = My.class;
        
        Method meth[] = c.getMethods();

        for(Method m : meth)
            System.out.println(m);
    }


}
