package inputoutput;

import java.io.*;

public class CharDemo {
    
    
public static void main(String[] args) throws Exception{
    
    char b[] = {'a','b','c','d','e','f','g','h','i','j'};

    CharArrayReader car = new CharArrayReader(b);

    int x;
    while((x = car.read()) != -1){

        System.out.print((char)x);
    }

    System.out.println();


    CharArrayWriter caw = new CharArrayWriter(20);

 caw.write('v');
 caw.write('a');
 caw.write('r');
 caw.write('u');
 caw.write('n');

 

    char ba[] = caw.toCharArray();
    

    for( char y : ba){

        System.out.println((char)y);
    }

 caw.close();

}
}
