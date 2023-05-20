import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
    public static void main(String []args){
       String str1 = "INDIA IS MY COUNTRY";
      char a[]=str1.toCharArray();
      int n=a.length;
      Map<Character,Integer> map = new HashMap<>();
      for(int i=0;i<n;i++){
          if (map.containsKey(a[i])){
              map.put(a[i],map.get(a[i])+1);
          }
      else{
          map.put(a[i],1);
          }
       }
      Set<Character> keys = map.keySet();
      for (Character c: keys){
          if(map.get(c)>1){
              System.out.println(c);
          }
       }
    }
}

