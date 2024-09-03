//when finally won't be executed
public class testFinally {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            //System.exit(0);
        } catch (Exception e) {
            System.out.println("catch block");
            System.exit(0);
        } finally{
            System.out.println("finally block");
        }
    }
}
