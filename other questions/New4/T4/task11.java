

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name=sc.next();
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        System.out.println("Enter email : ");
        String email=sc.next();

 



        File f=new File("person.txt");
        f.createNewFile();
        FileWriter fw1=new FileWriter(f);
        fw1.write("Name :"+name);
        fw1.write("\n");
        fw1.write("Age :"+age);
        fw1.write("\n");
        fw1.write("email :"+email);
        fw1.close();

        FileOutputStream fout=new FileOutputStream("person.txt");
        FileInputStream fin=new FileInputStream("person.txt");
        int i;
        i=fin.read();

        while(i!=-1){
            fout.write((int)i);
            System.out.println(i);
        i=fin.read();

        }
        fin.close();
        fout.close();;

    }
}
