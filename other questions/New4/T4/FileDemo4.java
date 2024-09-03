import java.io.*;
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File dir2=new File("MyFolder2");
        File f1=new File("MyFolder2","One.txt");
        File f2=new File("MyFolder2","two.txt");

        dir2.mkdir();
        if(f1.createNewFile()){
            System.out.println("One.txt created Successfully");
        }if(f2.createNewFile()){
            System.out.println("Two.txt created");
        }

    }
}