//Write a program that reads a Celsius degree in a double value from the console, 
// then converts it to Fahrenheit and displays the result. The formula for the 
// conversion is as follows: fahrenheit = (9 / 5) * celsius + 32
public class que74 {
    public static void main(String[] args) {
        double temp=54;

        double f=(9.0/5.0*temp)+32.0;
        double c=(temp-32.0)*(5.0/9.0);
        System.out.println(f);
        System.out.println(c);
    }
}
