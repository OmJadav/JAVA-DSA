//WAP to check given string is palindrome or not without using reverse method
public class que323 {
    public static void main(String[] args) {
        String s1="heeh";
String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            s2=s2+ch;
        }
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome not");
            
        }
    }
}
