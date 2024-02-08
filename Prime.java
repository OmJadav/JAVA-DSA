public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static String isPrime(int n){
        if(n==1){
            return "Prime Number";
        }
        if(n>1){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return "Not a Prime Number";
                }
            }
        }
        return "Prime Number";
    }
}
