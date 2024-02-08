public class BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println(BinomialCoEff(5, 2));   //nCr

    }
    public static int findFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int BinomialCoEff(int n,int r){
        int nfact=findFactorial(n);
        int rfact=findFactorial(r);
        int nMinusR=findFactorial(n-r);
        int answer=nfact/((rfact)*(nMinusR));
        return answer;
    }
}
