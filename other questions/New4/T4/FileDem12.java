
import java.io.*;;

public class FileDem12 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\T4");
        System.out.println("length of file :" +f1.length());

        File [] s=f1.listFiles();
        int fileCount=0;
        int directoryCount=0;
        for(File x:s){
            System.out.println("File/directorry : "+x);
            if(x.isFile()){
                fileCount++;
            }if(x.isDirectory()){
                directoryCount++;
            }
        }
        for(int i=0;i<s.length;i++){
           
        }
        System.out.println("Files :" +fileCount);
        System.out.println("Folder :"+directoryCount);
        System.out.println("total files/folder are : "+s.length);
      

    }
}
