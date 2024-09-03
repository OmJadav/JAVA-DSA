
import java.util.HashMap;
import java.util.Map;

public class Emp_hashMap {
    public static void main(String[] args) {
        HashMap<Integer, Employee11> emp = new HashMap<>();
        
         Employee11 e1=new Employee11("abc", 20, 5000);
        Employee11 e2=new Employee11("pqr", 21, 6000);
        Employee11 e3=new Employee11("xyz", 25, 60000);
       
        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        System.out.println("values :"+emp.values());
        System.out.println("keys :"+emp.keySet());
       
    }
}
class Employee11 {
    String name;
    int age;
    int salary;

    Employee11(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Emp Name : " + name + " age : " + age + " salary : " + salary;

    }
}