public class BinarySearch {
    public static void main( String[] args){
        int numbers[]={1,3,5,6,8,10,12,14};
        int key=5;
        System.out.println("Key found at index : "+binSearch(numbers, key));
    }
    public static int binSearch(int numbers[],int key){
            int start=0;
            int end=numbers.length-1;
        while(start<=end){
             int mid=(start+end)/2;
            if(numbers[mid]==key){
               return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
