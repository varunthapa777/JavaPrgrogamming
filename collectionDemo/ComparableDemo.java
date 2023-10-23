package collectionDemo;

import java.util.*;

class Point implements Comparable<Point>{

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p){

        if(this.x> p.x)
        return 1;
        else if(this.x < p.x)
        return -1;
        else
          {
            if(this.y>p.y)
            return 1;
            else if(this.y < p.y)
            return -1;
            else 
            return 0;
          }

    }

    public String toString(){
        return "("+x+","+y+")";
    }

}

public class ComparableDemo {
    
    public static void main(String[] args) {
        
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1, 0));
        ts.add(new Point(2, 5));
        ts.add(new Point(2, 0));
        
        System.out.println(ts);
    }
}
