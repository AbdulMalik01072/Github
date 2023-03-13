public class diff21 {
    public static void main(String [] args ){
        System.out.println(9>20);
        System.out.println(15>25);
        System.out.println(12<19);
    }
 public int diff(int n) {
        if (n>21){
            return 2*(Math.abs(n-21));
        }
        else{
            return Math.abs(n-21);
        }
 }
}
