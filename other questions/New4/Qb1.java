import java.io.*;

public class Qb1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("Name:Amit");
        bw.newLine();
        bw.write("Branch:CE");
        bw.newLine();
        bw.write("Roll No:45");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
