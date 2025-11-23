import java.io.*;
import java.net.*;

public class ServerB {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(5000);
        Socket s=ss.accept();
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out=new PrintWriter(s.getOutputStream(),true);
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while(true){
            str=in.readLine();
            if(str==null) break;
            System.out.println("Client: "+str);
            out.println(kb.readLine());
        }
    }
}


import java.io.*;
import java.net.*;

public class ClientB {
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("localhost",5000);
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out=new PrintWriter(s.getOutputStream(),true);
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while(true){
            out.println(kb.readLine());
            str=in.readLine();
            System.out.println("Server: "+str);
        }
    }
}
