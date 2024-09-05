public class PassbyReferenceValue {
    static int[] passedBy(int a, int b) {
        int nm[] = new int[2];
        nm[0] = a + 1;
        nm[1] = b + 2;
        return nm;

    }

    public static void main(String[] args) {
        int[] result = passedBy(10, 20);
        System.out.println(result[0] + " " + result[1]);
    }
}
