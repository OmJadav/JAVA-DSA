//

import java.io.*;

public class Task16 {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("file1.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader("file2.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        FileWriter fw = new FileWriter("file3.txt");
        FileWriter fw1 = new FileWriter("file4.txt");

        String s;

        while ((s = br1.readLine()) != null) {
            fw.write(s + "\n");
        }
        while ((s = br2.readLine()) != null) {
            fw.write(s + "\n");
        }
        while ((s = br2.readLine()) != null) {
            fw.write(s + "\n");
        }
        
        fr1.close();
        fr2.close();
        br1.close();
        br2.close();
        fw.close();
        fw1.close();

    }
}
