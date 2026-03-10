package Array;

import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String args[]) {

        int[] arr = { 5, 15, 13, 4 };
        // System.out.println(sumOfElements(arr));
        // findLargestAndSmallestElement();
        // reverseArray(arr);
        System.out.println(secondLargeElement(arr));
    }

    // Find the Sum of Elements
    static int sumOfElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Find the smallest and largest element in array
    static void findLargestAndSmallestElement() {
        int arr[] = { 4, 7, 1, 9, 3 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // brute force
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("LARGEST : " + max + " and " + "SMALLEST : " + min);
    }

    // Reverse an array without using another array

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swapArr(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swapArr(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // Find the Second Largest Element in array

    static int secondLargeElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return second;
    }
}
