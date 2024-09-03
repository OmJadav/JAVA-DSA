import java.io.*;;
public class FileDemo5 {
    public static void main(String[] args) throws IOException{
        File dir = new File("D:\\myFolder3");
        dir.mkdir();

        File f=new File(dir,"MyFile.txt");
        f.createNewFile();
        File dir2=new File("D:\\myFolder3\\myFolder4");
        dir2.mkdir();
        
    }
}
