import java.io.*;

public class InputStreamReader11 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Blog your Thoughts");
        String str=br.readLine();
        System.out.println("You have entered : "+str);
    }
    
}