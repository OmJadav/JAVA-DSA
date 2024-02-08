import java.util.*;

public class BinaryDecimal {
    public static void main(String args[]){
        BinToDec(111);
        DecToBin(7);
    }
    public static void BinToDec(int n){
        int Bin=n;
        int dec=0;
        int pow=0;
        while (n>0) {
            int reminder=n%10;
            dec=dec+(reminder*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
    
        System.out.println("the Decimal of "+Bin+" is :"+dec);

    }
    public static void DecToBin(int num){
        int Dec=num;
        int bin=0;
        int pow=0;
        while (num>0) {
            int reminder=num%2;
            bin=bin+(reminder*(int)Math.pow(10, pow));
            pow++;
            num=num/2;
        }
        System.out.println("the Binary of "+Dec+" is :"+bin);
    }
}
