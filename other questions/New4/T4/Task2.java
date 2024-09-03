//implement the class employee with name,age and salary
//create a list of employee with 5 employeeeee(consider your own data)
//display all employees and ask user index of employee to be removed from list.
//      remove said employee from list 
// ask index of employee whose details need to be updated
// update name ,age,salary  if no data is entered in name and age keep old data as it is
// display all employees in list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("abc", 20, 5000));
        emps.add(new Employee("pqr", 21, 6000));
        emps.add(new Employee("xyz", 25, 60000));
        emps.add(new Employee("mno", 30, 160000));
        emps.add(new Employee("Boss", 30, 500000));


        System.out.println("Displaying all employees : ");
        for (Employee e : emps) {
            System.out.println(e);
        }

        System.out.println("Enter Index of emp to be removed: ");
        int idx=sc.nextInt();
        if(idx>0 && idx<emps.size()){
            Employee e=emps.get(idx);
            emps.remove(idx);
            System.out.println("Employee removed : "+e);

        }
        System.out.println("Enter Index of emp to be updated: ");
        idx=sc.nextInt();
        if(idx>0 && idx<emps.size()){
            System.out.println("Enter new name: ");
            String name=sc.next();

            if(!name.isEmpty()){
                emps.get(idx).setName(name);
            }
        }
    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary) {
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