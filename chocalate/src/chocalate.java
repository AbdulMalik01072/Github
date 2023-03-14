public class chocalate {

    public static void main(String [] args ){
        System.out.println(frontBack("Duniya"));
        System.out.println(frontBack("India"));
        System.out.println(frontBack("ARAM"));

    }
    public  static String frontBack(String str){
        if (str.length()<=1){
            return str;
        }
        else {
            String mid = str.substring(1,str.length()-1);
            return str.charAt( str.length()-1)+ mid +  str.charAt(0);
        }
    }
}

