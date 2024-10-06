package GFG;

public class Min_Max_Array {
    public static void main(String[] args) {
        long[] numbers = { 3, 2, 1, 56, 10000, 167 };
        System.out.println("maximum :" + maxArray(numbers) + " and minimun : " + minArray(numbers));
    }

    public static long maxArray(long[] numbers) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static long minArray(long[] numbers) {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

}
