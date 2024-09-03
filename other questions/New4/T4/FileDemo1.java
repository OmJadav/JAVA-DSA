import java.io.*;
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("abc.txt");
        boolean flag;
        flag=f1.createNewFile();
        if(flag){
            System.out.println("File Created Successfully");
        }else{
            System.out.println("File already exists");
        }

    }
}
