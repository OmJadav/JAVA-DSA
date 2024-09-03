class RowSum extends Thread{
    int []arr;
    int row_no;
    int sum = 0;
    RowSum(int [] arr, int row_no){
        this.arr=arr;
        this.row_no=row_no;
    }
    public void run(){
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("row: "+row_no+" sum="+sum);
    }
}
public class Task2 {
    public static void main(String[] args) {
        int m,n;
        int [][]a = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                
            }
        }
    }
}
