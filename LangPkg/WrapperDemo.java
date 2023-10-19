package LangPkg;

public class WrapperDemo {
    
    public static void main(String[] args) {
        
        Integer i = Integer.valueOf(10);
        Integer j = i;
        Integer k = 10;
        Integer l = Integer.valueOf("1111", 2);

        System.out.println("i: "+i);
        System.out.println("k equal j : "+k.equals(j));
        System.out.println(l);
        System.out.println(Integer.parseInt("69"));
        
    }

    
}
