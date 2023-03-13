public class nearHundered {

    public static void main(String [] args ){
        System.out.println(10);
        System.out.println(176);
        System.out.println(76);

    }
    public boolean nearHundered(int n){
        if (Math.abs(n-100)<=10 || Math.abs(n-200)<=10){
            return true;
        }
        else{
            return false;
        }
    }
}
