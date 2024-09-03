
import java.io.*;;

public class FileDem11 {
    public static void main(String[] args) throws IOException {
        File f1=new File("abc.txt");
        System.out.println("length of file :" +f1.length());
        File f2=new File("D:\\MyFolder3");
        System.out.println("length of folder = "+f2.length());

        String[] s=f2.list();
        for(String x:s){
            System.out.println("File/directorry"+x);
        }
        File [] lf=f2.listFiles();
    for(File x:lf){
        System.out.println(x);
    }

    }
}
