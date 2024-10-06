public class Prime {
    public static void main(String[] args) {
        // System.out.println(isPrime(2));
        primeRange(10); // from 2 to number
    }
    
    public static Boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        if(n>1){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
System.out.println(i + " is Prime number");
            }
        }
    }
}
