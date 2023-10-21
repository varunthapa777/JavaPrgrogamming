package filesystem;

import java.io.FileOutputStream;

public class OutpuExample {

        public static void main(String[] args) throws Exception{
            
           

               FileOutputStream fos = new FileOutputStream("filesystem/Test.txt");

                String str = "This is Varun Thapa";

                // fos.write(str.getBytes());

                byte []b = str.getBytes();

                // for(byte x: b)
                //     fos.write(x);

                fos.write(b,8,b.length-8);

                fos.close();

           
        }
}