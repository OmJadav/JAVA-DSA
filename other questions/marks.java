import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("-----------------------------Welcome to Bank-----------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------Registration Page-----------------------------");

        System.out.print("User Full Name : ");
        String fullName=sc.nextLine();
        StringBuffer fullNameBuffer=new StringBuffer(fullName);
        System.out.print("User Birth Year : ");
        int birthYear=sc.nextInt();
        // System.out.print("User address : ");
        // String address=sc.nextLine();
        System.out.print("User Password : ");
        String password=sc.next();
        System.out.print("User Confirm Password : ");
        String confirmPassword=sc.next();


        // System.out.println(fullName);
        // System.out.println(birthYear);
        // System.out.println(address);
        // System.out.println(password);
        // System.out.println(confirmPassword);


        String[] splitName=fullName.split(" ");
        String firstName=splitName[0];
        String middleName=splitName[1];
        String lastName=splitName[2];

        StringBuffer firstNameBuffer=new StringBuffer(firstName);
        firstNameBuffer.reverse();
        int age=2024-birthYear;
        String userId=firstNameBuffer.toString()+age;

        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            boolean check=Character.isDigit(c);
            if(check){
                System.out.println("no digits allowed");
                return;
            }
        }
        if(password.length()<8 ){
            System.out.println("Password length must be greater than or equal to 8.");
            return;
        }
        else if(!password.equals(confirmPassword)){
            System.out.println("password and confirm password must be same!!");
            return;
        }else{
            System.out.println("-----------------------------Login Page-----------------------------");
            System.out.print("Enter User Name::");
            String userName=sc.next();
            System.out.print("Enter User Password::");
            String pass=sc.next();

            if(userId.equals(userName) && password.equals(pass)){
                System.out.println("************"+" Welcome, "+firstName+" ************");
            }else{
                System.out.println("Credentials Not Valid");
            }



        }
    }
}
