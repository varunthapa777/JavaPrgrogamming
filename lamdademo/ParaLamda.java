package lamdademo;

@FunctionalInterface
interface MyPara{

    public void display(String str);
}

@FunctionalInterface
interface MyCalc{

    public void opertion(int x, int y);
}

@FunctionalInterface
interface CanReturn{

    public int add(int x, int y);
}

public class ParaLamda {
    
    public static void main(String[] args) {
        
        // MyPara m = (s)->{System.out.println(s);};

        // m.display("Hello Varun");

        // MyCalc s = (a,b)->{System.out.println("Sum : "+a+b);};
        // MyCalc d = (a,b)->{System.out.println("Division: "+a/b);};
        
        // s.opertion(4, 5);
        // d.opertion(10, 5);

        CanReturn r = (a,b)->a+b; //or = (a,b)->{return a+b};
        
        System.out.println("Sum : "+r.add(20,50));
        }
}
