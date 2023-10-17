package ExceptionHandling;

import java.util.Scanner;

class InvalidAge extends Exception{

    public InvalidAge(String message){
        super(message);
    }
}

public class UserDefinedExcep {

    public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);

    try{
        
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        
        if(age <= 0){
            sc.close();
            throw new InvalidAge("Age Can't be negative");
            
        } 
    }
    catch(Exception e){
        System.out.println("Exception caught: "+e.getMessage());
    }
    
    
}

}
