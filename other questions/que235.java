// Write a JAVA Program to accept array of N integers and find Largest odd number 
// as well as largest even number and display them 
public class que235 {
    public static void main(String[] args) {
        int n[]={1,20,3,4,35,6,7,8,9,10};
        int oddL=0,evenL=0;        

        for(int i=0;i<n.length;i++){
            if(n[i]%2!=0){
                if(n[i]>oddL){
                    oddL=n[i];
                }
            }else if(n[i]%2==0){
                if(n[i]>evenL){
                    evenL=n[i];
                }
            }
            
        }
        System.out.println("Even largest::"+evenL);
        System.out.println("odd largest::"+oddL);

    }
}
