package Array;

import java.util.Scanner;

public class ArrayDemo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int [] ar1 = new int[5];
        //or
        int [] ar2 = new int[]{1,2,3,4,5};
        //or
        int [] ar3 = {1,2,3,4,5};
        //or
        int [] ar4;
        
        ar4 = new int[5];

        ar1[0] = 10;
        ar1[1] = 20;
        ar1[2] = 30;
        ar1[3] = 40;
        ar2[4] = 50;

        // without loop
        System.out.println("Index 0: "+ar1[0]);
        System.out.println("Index 1: "+ar1[1]);
        System.out.println("Index 2: "+ar1[2]);
        System.out.println("Index 3: "+ar1[3]);
        System.out.println("Index 4: "+ar1[4]);

        //using for loop

        for(int i=0; i<ar2.length; i++){
            
            System.out.print(ar2[i]+" ");
        }
        System.out.println();

        //using for-each loop for display
        
        for(int e: ar3){
            System.out.print(e+" ");
        }
        System.out.println();


        //input from user using scanner and for loop

        for(int i= 0; i< ar4.length; i++){

            ar4[i] = sc.nextInt();
        }

        for(int e : ar4){
            System.out.print(e);
        }
        System.out.println();
    }
}
