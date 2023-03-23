public class Array {
    public static void main(String[] args){
        Array();
    }
    public static void Array(){
        int a[]={1,3,4,8,0,11,16,87,97};
        System.out.println("Odd Numbers");
        for (int i=0;i<a.length;i++){
            if (a[i]%2 !=0){
                System.out.println(a[i]);
            }


        }
    }
}
