public class Switch {
    static double switchCase(int choice, Double arr[]) {
        switch (choice) {
            case 1:
                double area = arr[0] * arr[0] * 3.14;
                return area;

            case 2:
                double Rarea = arr[0] * arr[1];
                return Rarea;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Double arr[] = { 5.0 };
        System.out.println(switchCase(1, arr));
    }
}
