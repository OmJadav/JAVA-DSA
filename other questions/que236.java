// Write a program in JAVA to sort N integer Numbers in ascending order. bubble sort
public class que236 {
 public static void main(String[] args) {
    int n[]={1,20,3,4,35,6,7,8,9,10};

    for(int i=0;i<n.length;i++){
        for(int j=0;j<n.length-i-1;j++){
            if(n[j]>n[j+1]){
                int temp=n[j];
                n[j]=n[j+1];
                n[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n.length;i++){
        System.out.print(n[i]+" ");
    }
 }   
}
