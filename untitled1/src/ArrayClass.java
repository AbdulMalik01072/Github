public class ArrayClass {

    public static void main(String[] args) {


        int[][] ar = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
