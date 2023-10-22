package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopingFile {
    
    public static void main(String[] args) throws Exception{
        
        FileInputStream fis = new FileInputStream("filesystem/source1.txt");

        FileOutputStream fos = new FileOutputStream("filesystem/source2.txt");


        int x;

        while((x = fis.read()) != -1){

            if(x>= 65 && x<=120)
            fos.write(x+32);
            else
            fos.write(x);
            
        }
        
        fis.close();
        fos.close();
         

    }
    
}
