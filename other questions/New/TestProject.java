import java.util.Scanner;
public class TestProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean want_exit=true;
        while(want_exit){
            System.out.println("Select Your POST:");
            System.out.println("Enter 1 for Assistant Professor ");
            System.out.println("Enter 2 for Associate Professor ");
            System.out.println("Enter 3 for Professor ");
            System.out.println("Enter 4 for Exit or Quit ");
            System.out.print("Enter your choice : ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Assistant_professor ap=new Assistant_professor();
                    ap.display();
                    break;
                case 2:
                    Associate_professor asp=new Associate_professor();
                    asp.display();
                    break;
                case 3:
                    professor p=new professor();
                    p.display();
                    break;
                case 4:
                    System.out.println("Thank you ! ");
                    want_exit = false;
                    break;
                default:
                    System.out.println("Please enter valid choice. ");
            }
        }
        sc.close();
    }
}
class Employee{
    String emp_fname,emp_lname,experience,address,mail_id,mobile_no,post;
    static int emp_id=123;
    double bp,sal;
    Scanner sc = new Scanner(System.in);
    Employee(){
        System.out.println("Enter First Name : ");
        this.emp_fname=sc.next();
        System.out.println("Enter Last Name : ");
        this.emp_lname=sc.next();
        System.out.println("Enter Experience : ");
        this.experience=sc.next();
        System.out.println("Enter Address : ");
        sc.nextLine();
        this.address=sc.nextLine();
        checkMobile_no();
        genrateMailid();
        generateId();
    }

    void checkMobile_no() {
        boolean isValidMobile = false;
        while (!isValidMobile) {
            System.out.println("Enter mobile number : ");
            mobile_no = sc.next();

            if (mobile_no.length() == 10) {
                for (int i = 0; i < mobile_no.length(); i++) {
                    char c = mobile_no.charAt(i);
                    if (!Character.isDigit(c)) {
                        System.out.println("Enter valid number !");
                    } else {
                        isValidMobile = true;
                    }
                }
            } else {
                System.out.println("Enter valid mobile number");
            }
        }
    }
    void genrateMailid() {
        this.mail_id = emp_fname.toLowerCase() + "." + emp_lname.toLowerCase() + "@ljku.in";
    }
    void generateId(){
        emp_id=emp_id+1;
    }
    void display() {
        System.out.println("-----------------Employee Details-----------------");
        System.out.println("First name : " + emp_fname);
        System.out.println("Last name : " + emp_lname);
        System.out.println("Employee ID  : " + emp_id);
        System.out.println("Mail id  : " + mail_id);
        System.out.println("Address : " + address);
        System.out.println("Experience  : " + experience);
        System.out.println("mobile no  : " + mobile_no);
    }
    double salary(double bp,double da,double hra,double pf){
        double salary= bp + da + hra - pf;
        return salary;
    }
}
class Assistant_professor extends Employee{
    double bp, sal;
    Assistant_professor(){
        System.out.println("Enter Basic Pay(BP):: ");
        bp=sc.nextDouble();
        post="Assistant Professor";
        double da = bp * .7;
        double hra = bp * .10;
        double pf = bp * .12;
        this.sal=salary(bp,da,hra,pf);
    }
    void display(){
        super.display();
        System.out.println("Basic Pay : " + bp);
        System.out.println("Salary : " + sal);
        System.out.println("Post : " + post);
    }
}
class Associate_professor extends Employee{
    double bp, sal;
    Associate_professor(){
        System.out.println("Enter Basic Pay(BP):: ");
        bp=sc.nextDouble();
        post="Associate Professor";
        double da = bp * .75;
        double hra = bp * .15;
        double pf = bp * .12;
        this.sal=salary(bp,da,hra,pf);
    }
    void display(){
        super.display();
        System.out.println("Basic Pay : " + bp);
        System.out.println("Salary : " + sal);
        System.out.println("Post : " + post);
    }
}
class professor extends Employee{
    double bp, sal;
    professor(){
        System.out.println("Enter Basic Pay(BP):: ");
        bp=sc.nextDouble();
        post="Professor";
        double da = bp * .80;
        double hra = bp * .17;
        double pf = bp * .12;
        this.sal=salary(bp,da,hra,pf);
    }
    void display(){
        super.display();
        System.out.println("Basic Pay : " + bp);
        System.out.println("Salary : " + sal);
        System.out.println("Post : " + post);
    }
}