package collectionDemo;

import java.util.*;

public class ListLoopDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,10));

        //for loop
        System.out.println("for Loop : ");
        for(int i = 0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println("\n");
        
        
        //for-each loop
        System.out.println("for each loop: ");
        for(var e : al){
            System.out.print(e+" ");
        }
        System.out.println("\n");
        

        //Iterator
        System.out.println("Using Iterator\n");
        Iterator<Integer> it = al.iterator();

        
        // while loop
        System.out.println("While loop : ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        //for loop 
        System.out.println("\nFor loop : ");
        for(Iterator<Integer> itr = al.iterator(); itr.hasNext();){

            System.out.print(itr.next()+" ");
        }

        System.out.println("\nForEach loop");
        al.forEach((n)->System.out.print(n+" "));
       
        System.out.println("\nForEach loop");
        al.forEach(System.out::println);

        System.out.println("\nForEach el less than equal to 5");
        al.forEach((n)->display(n));
        System.out.println();
        //or 
        al.forEach(ListLoopDemo::display);
    }

    static void display(int n){

        if(n <= 5)
        System.out.print(n+" ");

    }

}
