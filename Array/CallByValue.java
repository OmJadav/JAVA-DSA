public class CallByValue {
    public static void main(String[] args) {

        // swap two number
         int a=5,b=10;
        swap(a,b);
        //  int temp=a;
        //  a=b;
        //  b=temp;

        //  System.out.println("after swap A:"+a);
        //  System.out.println("after swap B:"+b);

    }

    public static void swap(int a,int b){
        // int a=5,b=10;

        int temp=a;
        a=b;
        b=temp;

        System.out.println("after swap A:"+a);
        System.out.println("after swap B:"+b);
    }
}
