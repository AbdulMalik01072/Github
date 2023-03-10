public class IntValue {
    public static void main(String[] args) {
        System.out.println(sumDouble(4, 4));
        System.out.println(sumDouble(2, 9));

    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
