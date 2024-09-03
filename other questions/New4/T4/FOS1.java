import java.io.*;

public class FOS1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("xyz.txt");
        FileInputStream fin=new FileInputStream("abc.txt");
        int i;
        i=fin.read();

        while(i!=-1){
            fout.write((char)i);
            System.out.println(i);
        i=fin.read();

        }
        fin.close();
        fout.close();;
        System.out.println("Write Suceessfulllllllllllllllllll");
    }
}