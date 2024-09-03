// wap that ask a user their faviourite food
// also ask user rough price of that food 
// write its data into a file as foodItem:name a food,price of food:price .
// copy this data from one file to another file
import java.util.Scanner;
import java.io.*;

public class task17 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favourite food");
        String food=sc.next();
        System.out.println("Price of food");
        double price=sc.nextDouble();
        RandomAccessFile raf = new RandomAccessFile("food.txt", "rw");
        RandomAccessFile raf1 = new RandomAccessFile("foodCopy.txt", "rw");
        String foodString="foodItem : "+food+"\n"+"price of food : "+price;
        byte[] data=foodString.getBytes();
        raf.write(data);
        raf.seek(0);
        byte [] buffer=new byte[(int)raf.length()];
        raf.read(buffer);
        raf1.write(buffer);
        raf1.close();
        raf.close();


    }
}
