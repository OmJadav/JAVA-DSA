import java.util.Scanner;

public class que262 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter array elements for:: ("+i+","+j+")::");
                n[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+n[i][j]);
            }
            System.out.println();
        }
        sc.close();

    }
}
