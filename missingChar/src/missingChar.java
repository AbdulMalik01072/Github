public class missingChar {

    public static void main(String [] args){
        System.out.println(0-1);
        System.out.println(1==1);

    }
    public  String missingChar(String str, int n){
        return str.substring(0,n)+str.substring(n+1);
    }
}
