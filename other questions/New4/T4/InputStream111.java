import java.io.*;

public class InputStream111 {
    public static void main(String[] args)throws IOException {
        InputStream s=new FileInputStream("abc.txt");
        Reader r=new InputStreamReader(s);
        int data=r.read();
        while(data!=-1){
            System.out.print((char)data);
            data=r.read();
        }
        String sr=r.readLines();
        while (s!=null) {
            System.out.println(s);
            sr=r.readLines();
        }

    }
}
