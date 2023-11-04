package networksocket;

import java.net.*;
import java.io.*;

public class Client {
    
    public static void main(String[] args) throws Exception {
        
        Socket stk = new Socket("localhost",2000);
        
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do{
            msg = keyb.readLine();
            ps.println(msg);
            
            msg = bf.readLine();
            System.out.println("From Server: "+msg);


        }while(!msg.equals("dne"));

        stk.close();
    }    
}
