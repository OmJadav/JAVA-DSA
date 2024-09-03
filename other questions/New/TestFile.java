public class TestFile {

    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.id);
    }
}
class Student {
    String name;
    int id;
}