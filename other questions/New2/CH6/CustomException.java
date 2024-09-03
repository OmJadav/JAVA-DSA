//ask user to input a number. if number is -ve , raise custom exception
import java.util.*;
class NegNumException extends RuntimeException {
    NegNumException(){
        super("enter positive number");
        //System.out.println("enter positive number");
    }
}
class CustomException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            if(n<0){
                sc.close();
                throw new NegNumException();
            }
        } catch (NegNumException e) {
           System.out.println("catch block called!!");
           System.out.println(e.getMessage());
        }
    }
}