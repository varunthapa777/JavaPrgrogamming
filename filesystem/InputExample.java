package filesystem;

import java.io.FileInputStream;
// import java.io.FileReader;


public class InputExample {
    
    public static void main(String[] args) throws Exception{
    
        FileInputStream fis = new FileInputStream("./filesystem/Test.txt");
        // FileReader fr = new FileReader("./filesystem/Test.txt");

        // // method 1
        // byte b[] = new byte[fis.available()];
        // fis.read(b);

        // String str = new String(b);

        // System.out.println(str);


        //method 2
        // int x;

        // while((x = fis.read()) != -1){

        //     System.out.print((char)x);
        // }

        fis.close();


    }
}
