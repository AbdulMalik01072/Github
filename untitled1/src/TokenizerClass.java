import java.util.StringTokenizer;

public class TokenizerClass {

    public static void main(String[] args) {
        String s = "my name is ABDUL MALIK";
        reverseString(s);


    }
    public static void reverseString (String s ) {
        String S1;
        StringTokenizer ST = new StringTokenizer(s, "");
        while (ST.hasMoreTokens()) {
             S1 = ST.nextToken();
            System.out.println(new StringBuilder().reverse().toString());
        }
    }
}
