// DMD:ref=parent,object=child
import java.util.*;
class Shape{
    int a,b;
    void area(){
        System.out.println("a="+ a);
        System.out.println("b="+b);
    }
}
class Rectangle1 extends Shape{
    void area(){
        super.area();
        System.out.println("Area of Rectangle=" + (a*b) );
    }
}
class Triangle1 extends Shape{
    void area(){
        super.area();
        System.out.println("area of triangle" + (0.5*a*b));
    }
}
 class DownCasting2 {
    public static void main(String[] args) {
        Shape s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 variables:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Enter your choice:");
        int ch = sc.nextInt();
        switch(ch){
            case 1 : s=new Rectangle1();break;
            case 2 : s=new Triangle1();break;
            default : s=new Shape();
        }
        s.a=x;
        s.b=y;
        sc.close();
    }
}
