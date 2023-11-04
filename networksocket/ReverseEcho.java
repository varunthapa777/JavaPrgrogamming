package networksocket;

import java.net.*;
import java.io.*;

public class ReverseEcho  {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader bf = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do{
            msg = bf.readLine();
            
            sb = new StringBuilder(msg);
            sb.reverse();

            msg = sb.toString();
            ps.println(msg);

        }while(!msg.equals("dne"));

        ss.close();
    }    
}