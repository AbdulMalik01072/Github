public class posNeg2 {

    public static void main(String[] args) {
        System.out.println(1<0);
        System.out.println(-1==-1);
        System.out.println(-5>-4);


    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative == true) {
            if (a < 0 && b > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((a < 0 && b < 0) || (a > 0 && b < 0)) {
                return true;
            } else {
                return false;
            }
        }
    }
}












