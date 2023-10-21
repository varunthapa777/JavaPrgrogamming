package lamdademo;

@FunctionalInterface
interface ItsLamda{

    public void display();
}

class Demo{

    int var;

    public void method1(){

        final int count=10;//in should be finalize

        ItsLamda l = ()->{

            int var2 = 10; //It should be inialized
            System.out.println("Hey"+ count); //  method local var 'count' can't be changed.
            System.out.println("bye "+ ++var); // class data member 'var' can be changed.
            System.out.println("var2"+var2++); //lamda local var "var2" can be changed.
            };
        
        l.display();
    }
}

public class VariableLamda {
    
    public static void main(String[] args) {
        
        Demo d = new Demo();

        d.method1();
    }
}
