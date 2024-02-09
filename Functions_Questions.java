public class Functions_Questions {
    public static void main(String args[]){
        
        // System.out.println(aveOfthree(3,3 ,3));
        // System.out.println(isEven(5));
        int num=152;
        if(isPalindrome(num)){
            System.out.println("Number is palindrome..");
        }else{
            System.out.println("Number is not a palindrome..");
        }

        System.out.println("Sum of Digit of Number "+num+" = "+sumOfDigit(num));
    }

    // Write a Java method to compute the average of three numbers..
    public static double aveOfthree(double a,double b,double c){
            return (a+b+c)/3;
    }

    // Write a method named isEven that accepts an int argument. The method
    // should return true if the argument is even, or false otherwise. Also write a program to test your
    // method.
    public static Boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    // Write a Java program to check if a number is a palindrome in Java? ( 121 is a
    // palindrome, 321 is not) 
    // A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
    // palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
    // palindrome because the reverse of 321 is 123, which is not equal to 321.

    public static Boolean isPalindrome(int num){
        int palindrome=num;
        int reverse=0;
        while(palindrome!=0){
            int reminder=palindrome%10;
            reverse=reverse*10+reminder;
            palindrome=palindrome/10;
        }
        if(num==reverse){
            return true;
        }
        return false;
    }


    // Write a Java method to compute the sum of the digits in an integer

    public static int sumOfDigit(int num){
        int sumOfdigits=0;
        while(num>0){
            int reminder=num%10;
            sumOfdigits=sumOfdigits+reminder;
            num=num/10;
        }
        return  sumOfdigits;
    }

}
