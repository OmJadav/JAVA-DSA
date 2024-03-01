public class LinearSearch {
    public static void main(String[] args){
        int marks[]={2,4,6,7,8,10,12,14,16};
        int key=10;

        int index=linear(marks, key);
        System.out.print("Your key is found on index ::"+index);


    }
    public static int linear(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
}
