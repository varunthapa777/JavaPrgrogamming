package inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferDemo {
    

    public static void main(String[] args) throws Exception{
        

        FileInputStream fis = new FileInputStream("./inputoutput/bfile.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.println(bis.markSupported());

        System.out.print((char)bis.read()); 
        System.out.print((char)bis.read()); 
        System.out.print((char)bis.read()); 
        bis.mark(10);
        System.out.print((char)bis.read()); 
        System.out.print((char)bis.read()); 
        bis.reset();
        
        System.out.print((char)bis.read()); 
        System.out.print((char)bis.read()); 

        String str = new String(bis.readAllBytes());

        System.out.println(str);
        bis.close();

    }
}
