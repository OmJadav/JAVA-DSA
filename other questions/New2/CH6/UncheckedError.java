import java.util.*;
public class UncheckedError {
    public static void main(String[] args) {
        double n1=1,n2=1;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 2 numbers:");
             n1 = sc.nextDouble();
             n2 = sc.nextDouble();
            if(n2==0){
                throw new ArithmeticException("Can't divide by zero");
            }
        } catch (ArithmeticException e) {
            n2=1;
           System.out.println(e.getMessage());
        } catch(Exception e ){
            System.out.println(e);
        }
        finally{
            double result = n1/n2;
            System.out.println("result="+result);
            sc.close();
        }
    }
}
