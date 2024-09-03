public class que201 {
    public static void main(String args[]){
        int number=123;
        int reverse=0;

        while (number>0) {
            
            int lastD=number%10;
            reverse=reverse*10+lastD;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
