import java.util.*;
public class findAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacdcba";
        String p = "abc";
        List<Integer> result = ana(s, p);
        System.out.println(result);

    }


    public static List<Integer> ana(String s,String p){
     int k = p.length(); //window size
     int i=0;
     int j=0;
     HashMap<Character,Integer> map1 = new HashMap<>();
     HashMap<Character,Integer> map2 = new HashMap<>();
     List<Integer> list= new ArrayList<>();

     char[] sArray = s.toCharArray();
     char[] pArray = p.toCharArray();

     int n = sArray.length;

     for(char t : pArray){
       map1.put(t, map1.getOrDefault(t,0 )+1); //map1 = {a=1,b=1,c=1}
     }     

     while(j<n){
        map2.put(sArray[j], map2.getOrDefault(sArray[j], 0)+1);
       if(j-i+1<k){
       
        j++;
       }
       else if(j-i+1==k){
        if(map1.equals(map2)){
            list.add(i);
        }
        if (map2.get(sArray[i]) > 1) {
            map2.put(sArray[i], map2.get(sArray[i]) - 1);
        }
        else
        map2.remove(sArray[i]);
        i++;
        j++;
       }
     }
    return list;
    }
}
