/*  create abstarct class language with abstract method show().
-> Inherit class Java from Language & override show method
call show() method in Main using DMD
*/
abstract class Language{
    abstract void show();
}
class Java extends Language{
    void show(){
        System.out.println("Java class");
    }
}
public class Task1 {
    public static void main(String[] args) {
        Language l1 = new Java();
        l1.show();
    }
}
