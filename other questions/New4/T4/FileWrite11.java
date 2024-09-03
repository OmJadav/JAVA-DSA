import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite11 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\test.txt");
        f.createNewFile();
        FileWriter fw1=new FileWriter(f);
        fw1.write("Hello \n This is test \nBye");
        fw1.close();

        FileWriter fw2=new FileWriter("newTest.txt");
        fw2.write("Hi");
        fw2.write("\n");
        fw2.write("Bye");                         
        fw2.close();
    }    
}
