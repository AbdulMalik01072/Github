import java.sql.SQLOutput;

public class TestClass {

    public static void main(String[] args) {

    }

    public static String concatString() {

        StringBuffer Sb = new StringBuffer("Java");
        for (int i = 0; i <= 10000; i++);{
            Sb.append("class");
        }
        System.out.println("Sb");
        return "Sb";
    }
}

