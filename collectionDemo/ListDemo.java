package collectionDemo;

import java.util.*;

public class ListDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(1,2,3,4,5));
        

        al1.add(10);
        al1.add(20);
        al1.addAll(2, al2);

        System.out.println(al1);

        System.out.println("al1 Contains 3: "+ al1.contains(3));
        System.out.println("al1 Contains 50: "+ al1.contains(50));
        System.out.println("al1 IndexOf 3: "+al1.indexOf(3));
        System.out.println("al1 IndexOf 50: "+al1.indexOf(50));


        System.out.println();
        //al2
        System.out.println("al2 : "+al2);
        System.out.println("al2 size : "+ al2.size());
        System.out.println("AddLast 2");al2.addLast(2);
        System.out.println("al2 : "+al2);    
        System.out.println("addFirst 10"); al2.addFirst(10);  
        System.out.println("al2 : "+al2);    

        System.out.println(" get first and Last "+ al2.getFirst() + "  "+al2.getLast());
        System.out.println("Indexof 2 from start: "+al2.indexOf(2));
        System.out.println("Indexof 2 from Last: "+al2.lastIndexOf(2));
        System.out.println("Remove elm in index 5..."); al2.remove(5);
        System.out.println("set 70 in index 2");al2.set(2,70);
        System.out.println("al2: "+al2);
        


        System.out.println("Clear all...");al2.clear();
        System.out.println("al2: "+al2);
        System.out.println("IsEmpty ?: "+al2.isEmpty());

        
        

    }

}
