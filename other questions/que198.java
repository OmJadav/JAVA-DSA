// WAP to find out sum of first and last digit of a given number 
public class que198 {
    public static void main(String[] args) {
        int num=102;
        int sum=0;
        int lastD=num%10;
        int first=num;
        while (first >= 10) {
            first /= 10;
        }
        sum=first+lastD;
        System.out.println(sum);
        }
}
