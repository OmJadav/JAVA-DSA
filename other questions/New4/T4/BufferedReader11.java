import java.io.*;


public class BufferedReader11 {
    public static void main(String[] args) throws IOException{
        FileReader fr1=new FileReader("D:\\test.txt");
        BufferedReader br=new BufferedReader(fr1);
        int i=br.read();
        while(i!=-1){
            System.out.print((char)i);
            i=br.read();
        }
        String s=br.readLine();
        while(s!=null){                     
            System.out.println(s.toUpperCase());
            s=br.readLine();
        }
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        br.close();
        fr1.close();
    }
}
