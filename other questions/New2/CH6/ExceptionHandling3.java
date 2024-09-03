public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            int a =10/0;
            int []b = new int[3];
            b[5]=11;
            System.out.println(a);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("finally block");
        }
    }
}
