package filesystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SeqInputExample {

    public static void main(String[] args) throws Exception{
        

        FileInputStream fis1 = new FileInputStream("filesystem/source1.txt");
        FileInputStream fis2 = new FileInputStream("filesystem/source2.txt");

        FileOutputStream fos = new FileOutputStream("filesystem/destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);


        int x;

        while((x = sis.read()) != -1){

            fos.write(x);
        }

        fis1.close();
        fis2.close();
        fos.close();
        sis.close();
    }
    
}