class Parent1{
    void m1(){
        System.out.println("Parent::m1");
    }
    void m2(){
        System.out.println("Parent::m2");
    }
}
class Child1 extends Parent1{
    void m1(){
        System.out.println("Child1::m1");
    }
    void m3(){
        System.out.println("Child1::m3");
    }
}
class Child3 extends Parent1{
    void m2(){
        System.out.println("Child2::m2");
    }
    void m4(){
        System.out.println("Child2::m4");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.m1();
        p.m2();
        //p.m3();   //CE 
        Child1 c1 = new Child1();
        c1.m1();
        c1.m2();
        c1.m3();
        Parent1 p1 = new Child1();
        p1.m1();
        p1.m2();
        //p1.m3();     //CE
        //Child1 c2 = new Parent1();  //error
        Child3 c2 = new Child3();
        c2.m1();
        c2.m2();
        //c2.m3();      //CE
        c2.m4();
        Parent1 p2 = new Child3();
        p2.m1();
        p2.m2();
        //p2.m3();      //CE
        //p2.m4();      //CE
    }
}
