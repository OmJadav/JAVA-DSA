import java.io.*;

public class FileOutStream1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("abc.txt");
        String s ="hello this is first line";

        byte[] b=s.getBytes();
        fout.write(b);
        for(int i=60;i<65;i++){
            fout.write((byte)i);
        }
        
        fout.close();;
        System.out.println("Write Suceessfulllllllllllllllllll");
    }
}