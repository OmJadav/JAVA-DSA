public class ExceptionHandling1 {
    public static void main(String[] args) {
        System.out.println("Statement-1");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
           System.out.println(e.getMessage());
           System.out.println(e.toString());
           System.out.println(e);
           e.printStackTrace();
        }
        System.out.println("Statement-3");
    }
}
