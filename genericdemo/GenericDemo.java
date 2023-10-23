package genericdemo;


class Data<T>{

    private T obj;

    public void setData(T obj){
        this.obj = obj;
    }

    public T getData(){
        return obj;
    }
}
public class GenericDemo{

    public static void main(String[] args) {
     
        Data<String> obj1 = new Data<>();
        Data<Integer> obj2 = new Data<>();

        obj1.setData("Varun");
        System.out.println(obj1.getData());

        obj2.setData(50);
        System.out.println(obj2.getData());
        
    }
}
