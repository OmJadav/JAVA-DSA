import java.io.*;;
public class FileDemo6 {
    public static void main(String[] args) throws IOException{
        File x = new File("abc.txt");
if(x.isFile()){
    System.out.println("Abc.txt is file");
}if(x.isDirectory()){
    System.out.println("Abc.txt is directory");
}       
}
}
