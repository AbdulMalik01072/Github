public class parrotTrouble {

    public static void main(String[] args) {
        System.out.println(7 > 21);
        System.out.println(9 > 22);
        System.out.println(5 < 20);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true) {
            if (hour < 7 || hour > 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}