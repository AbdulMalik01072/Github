public class CountingZero {
    public static void main(String[] args) {
        //move the zeros in the last of the array
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
      }
    }



