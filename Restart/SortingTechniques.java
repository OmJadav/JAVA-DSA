public class SortingTechniques {
    public static void main(String args[]) {
        int arr[] = { 3, 2, 5, 1, 4 };
        // System.out.println(" Bubble Sort : : ");
        // BubbleSort(arr);
        System.out.print(" Selection Sort : : ");
        SelectionSort(arr);
    }

    // Bubble Sort Algorithm
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArray(arr);
    }

    // Selection Sort Algorithm
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }

    public static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
