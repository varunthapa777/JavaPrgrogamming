package LangPkg;


class MyObject{

    int id;

    public MyObject(int id){
        this.id = id;
    }
    public String toString(){ // overridde toString
        return "This is MyObject: "+ id;
    }

}
public class LangDemo {

    public static void main(String[] args) {
        
        MyObject obj = new MyObject(101);
        MyObject obj2 = obj;
        System.out.println(obj);
        System.out.println(obj.equals(obj2)); //true
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
    
    }
}
