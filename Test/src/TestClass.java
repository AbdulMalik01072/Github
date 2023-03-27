public class TestClass {
    // create an array out an elements and print only odd numbers
    public static void main(String[] args) {
        Array();
    }

    public static void Array() {
        int a[] = {3, 4, 5, 6, 7, 8, 9, 11, 13, 12, 14, 15, 17};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}