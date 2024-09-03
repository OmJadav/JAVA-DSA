import java.io.FileReader;
import java.io.IOException;

public class FileRead11 {
    public static void main(String[] args) throws IOException {
        FileReader fr1=new FileReader("D:\\test.txt");
        int i=fr1.read();

        while (i!=-1) {
            System.out.println((char)i);
            i=fr1.read();
        }


    }
    
}
