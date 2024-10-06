public class SubArrays {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArr(numbers);
    }
    public static void subArr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.err.print(numbers[k]+" ");
                }
                System.out.println();
            }

        }
    }
}
