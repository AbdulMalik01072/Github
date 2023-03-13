public class posNegative {

    public static void main(String [] args ){
        System.out.println(true);
        System.out.println(false);
        System.out.println(true);
    }
    public boolean posNeg(int a,int b, boolean negative){
        if (negative == true){
            if(a<0 && b<0) {
                return true;
            }
            else{
                return false;

            }
        }
        else{
            if((a<0 && b>0) || (a>0 && b<0)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
