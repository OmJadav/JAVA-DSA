//2 ,4 ,6 ,8 ,10
//pairs---2,4   2,6   2,8   2,10
//pairs---4,6   4,8   4,10

public class PairsArray {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        pairs(numbers);
    }

    public static void pairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
}
