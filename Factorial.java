public class Factorial {
    public static void main(String[] args) {
      
        System.out.println(findFactorial(7));

    }
    public static int findFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
