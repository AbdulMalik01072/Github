public class Strings {

    public static void main(String[] args) {
        System.out.println("not candy");
        System.out.println("candy");


    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }
}