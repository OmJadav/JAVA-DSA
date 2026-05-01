public class InterviewPractice {
    public static void main(String[] args) {

        // revString();
        // checkPalindrome();
        // largetNumInArr();
        // swap2without3rd();
        secondLargetNumInArr();
    }

    public static void revString() {
        String string = "hello";
        String rev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }
        System.out.println(rev);
    }

    public static void checkPalindrome() {
        String string = "madam";
        String rev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }
        if (string.equals(rev)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }

    public static void largetNumInArr() {
        int[] arr = { 1, 5, 3, 8, 13, 6 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAX : " + max);
    }

    public static void secondLargetNumInArr() {
        int[] arr = { 1, 5, 3, 8, 13, 6 };
        int largest = arr[0];
        int secondLarge = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLarge = largest;
                largest = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != largest) {
                secondLarge = arr[i];
            }
        }
        System.out.println("Second large : " + secondLarge);
    }

    public static void swap2without3rd() {
        int a = 20, b = 60;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A - " + a + " and" + " B - " + b);
    }
}
