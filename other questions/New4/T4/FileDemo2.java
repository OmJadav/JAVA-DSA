import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("abc.txt");
        boolean flag;
        flag=f1.exists();
        if(flag){
            System.out.println("File already exists");
        }else{
            flag=f1.createNewFile();
            System.out.println("File Created Successfully");
           
        }

    }
}