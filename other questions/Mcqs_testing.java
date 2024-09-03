import java.util.Scanner;

public class Mcqs_testing {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Prompt the user to enter the character to count its occurrence
        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0);
        
        // Close the scanner
        scanner.close();
        
        // Count the occurrence of the target character
        int occurrenceCount = countOccurrences(inputString, targetChar);
        
        // Display the result
        System.out.println("The character '" + targetChar + "' occurs " + occurrenceCount + " times in the string.");
    }
    
    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
