public class SubArraysSum {
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        // subArrSum(numbers);  //brute force  O(n^3)
        kadanes(numbers);       //kadanes   O(n)
    }

    // brute force
    public static void subArrSum(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){ 
                int currSum=0;
                for(int k=i;k<=j;k++){
                    System.err.print(numbers[k]+" ");
                    currSum+=numbers[k];
                }
                System.out.println("Sub Array Sum = "+currSum);
                System.out.println();
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum:: "+maxSum);    
    }

    //kadane's Algo
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }
            ms=Math.max(currSum, ms);
        }
        System.out.println("Max subarray sum is :: "+ms);
    }
}
