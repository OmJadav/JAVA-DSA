// WAP to convert days into months and days
public class que73 {
    public static void main(String args[]){
        int days=80;

        int remainDays=days%30;
        int months=days/30;

        System.out.println(months+" Month/s"+" and "+remainDays+" Days");

    }
}
