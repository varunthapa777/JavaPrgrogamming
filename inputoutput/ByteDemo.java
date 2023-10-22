package inputoutput;

import java.io.*;

public class ByteDemo {
    
    
public static void main(String[] args) throws Exception{
    
    // byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

    // ByteArrayInputStream bais = new ByteArrayInputStream(b);

    // int x;
    // while((x = bais.read()) != -1){

    //     System.out.print((char)x);
    // }

    // String str = new String(bais.readAllBytes());

    // System.out.println(str);
    // bais.close();


    ByteArrayOutputStream baos = new ByteArrayOutputStream(20);

    baos.write('v');
    baos.write('a');
    baos.write('r');
    baos.write('u');
    baos.write('n');

    baos.writeTo(new FileOutputStream("./inputoutput/byteDemofile.txt"));

    byte ba[] = baos.toByteArray();
    

    for( byte x : ba){

        System.out.println((char)x);
    }

    baos.close();

}
}
