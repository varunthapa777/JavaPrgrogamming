package collectionDemo;

import java.util.*;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> ld1 = new LinkedList<>();
        LinkedList<Integer> ld2 = new LinkedList<>(List.of(1,2,3,4,5,6,7,11));
        

        ld1.add(0);
        ld1.add(10);
        ld1.addAll(0,ld2);
        ld1.add(5,80);
        ld1.set(0,100);
        
        ld1.pollLast();
        ld1.pop();

        ld1.forEach(System.out::println);


    }

}
