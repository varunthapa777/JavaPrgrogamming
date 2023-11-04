package networksocket;

import java.net.*;
import java.io.*;

public class MultiReverseEcho extends Thread{
    
    Socket stk;
    MultiReverseEcho(Socket stk){
        this.stk = stk;
    }

    public void run(){
    try{
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
    }catch(Exception e){}
     
    }

    public static void main(String[] args) throws Exception {
        

        try (ServerSocket ss = new ServerSocket(2000)) {
            Socket stk;
            int count =1 ;
            
            do{
                stk = ss.accept();
                System.out.println("Client Connected: "+count++);
                MultiReverseEcho mre = new MultiReverseEcho(stk);
                mre.start();

            }while(true);
        }catch(Exception e){}
       

    }
}
