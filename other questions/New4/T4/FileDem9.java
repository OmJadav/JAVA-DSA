
import java.io.*;;

public class FileDem9 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("abc.txt");
System.out.println("Is file executable ? "+f1.canExecute());   
System.out.println("Is file readable ? "+f1.canRead());
System.out.println("Is file writable ? "+f1.canWrite());

    }
}
