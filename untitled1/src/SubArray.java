import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 5};

        System.out.println(maxlengthSubArray(input));
    }

    private static int maxlengthSubArray(int[] arry) {
        int maxLength = 0;
        int start = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int end = 0; end < arry.length; end++) {
            int num = arry[end];
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            while (freq.get(num) > 1) {
                int startNum = arry[start];
                freq.put(startNum, freq.get(startNum) - 1);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;

    }
}