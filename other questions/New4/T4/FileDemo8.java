import java.io.*;;

public class FileDemo8 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("oopj");
        f1.mkdir();
        File f2 = new File(f1,"unit10");
        f2.mkdir();
        File f3 = new File(f2,"FileHandling");
        f3.mkdir();

        File f4 = new File(f3,"file.txt");
        f4.createNewFile();
        System.out.println("File txt parent : " + f4.getParent());

        System.out.println(f4.getParentFile());
    }
}
