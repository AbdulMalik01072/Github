public class SleepIn {
    public static void main(String []args){
        System.out.println(sleepIn(true,false));
        System.out.println(sleepIn(false,true));
        System.out.println(sleepIn(true,true));
        System.out.println(sleepIn(false,false));

    }
    public  static boolean sleepIn(boolean weekdays,boolean vacation) {
    if (!weekdays || vacation){
        return true;
    }
    else {
        return false;
    }

    }
}
