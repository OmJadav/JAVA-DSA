import java.io.*;;

public class FileDemo7 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("MyFolder1\\hello.txt");
        f1.createNewFile();
        String path = f1.getPath();
        System.out.println("Path : " + path);
        String absPath = f1.getAbsolutePath();
        System.out.println("Absolute path : " + absPath);
    }
}
