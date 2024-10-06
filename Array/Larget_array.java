import java.util.*;
public class Larget_array {
    public static void main(String[] args) {
        int numbers[]={9,2,5,1,0,7,25};
        System.out.println("Largest Number is :: " + largestNumber(numbers));
        System.out.println("Smallest Number is :: " + smallestNumber(numbers));
        
    }
    public static int largestNumber(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
                if(numbers[i]>largest){
                    largest=numbers[i];
                }
                
        }
        return largest;
    }
    public static int smallestNumber(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
                if(numbers[i]<smallest){
                    smallest=numbers[i];
                }
                
        }
        return smallest;
    }
}
