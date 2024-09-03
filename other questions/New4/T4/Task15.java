//wap to read data from Source.txt And write to dest.txt while writing  in dext.txt
// replace word1 by word2
import java.io.*;

public class Task15 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("source.txt");
        BufferedReader br=new BufferedReader(fr);

        FileWriter fw=new FileWriter("dest.txt");
        String s;
        String word1="world";
        String word2="person";
        while((s=br.readLine())!=null){
            String [] stw=s.split(" ");
            for(String x:stw){
                if(x.equals(word1)){
                    fw.write(word2+" ");
                }else{
                    fw.write(x+" ");
                }
            }
            fw.write("\n");
        }
        fr.close();
        br.close();
        fw.close();

    }
}   
