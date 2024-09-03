import java.io.*;
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f1=new File("MyFolder12");
        boolean flag;
        flag=f1.mkdir();
        if(flag){
            flag=f1.createNewFile();
            System.out.println("Directory Created Successfully");
        }else{
            System.out.println("Directory already exists");
        }

    }
}