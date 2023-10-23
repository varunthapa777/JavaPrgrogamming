package collectionDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo { // It is used as stack as well as queue Faster than Stack and Linked list.
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad = new ArrayDeque<>(1);

        ad.addFirst(5);
        ad.offerFirst(10);

        
        System.out.println(ad);
        System.out.println(ad.getFirst());
       // System.out.println(ad.peek());
       //System.out.println(ad.peekFirst());

        //ad.remove(5);
        ad.removeFirst();
       // ad.pollFirst()

        ad.addLast(100);
        ad.offerLast(90);
        System.out.println(ad);
       // System.out.println(ad.peekLast());
        System.out.println(ad.getLast());

        ad.forEach((n)->System.out.print(n+" "));
    }
}
