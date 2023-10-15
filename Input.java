import java.util.Scanner;

class Input{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Number : "+n);

    
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        
        System.out.println("String : "+s);

        sc.close();
    }
}