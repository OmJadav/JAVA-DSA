// WAP by using else if ladder to print grade of a student using following rules :
// Percentage >70 means Grade A
// Percentage 60-70 means Grade B
// Percentage 50-60 means Grade C
// Percentage <50 means Grade F
public class que117 {
    public static void main(String args[]){
        int grade=27;

        if(grade>70){
            System.out.println("A grade");
        }else if(grade<70 && grade>60){
            System.out.println("B grade");
        }else if(grade<60 && grade>50){
            System.out.println("C grade");
        }else{
            System.out.println("F grade");

        }
    }
}
