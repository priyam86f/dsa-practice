import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;



public class sortbyheights {
    public static void main(String[] args) {
       String[] names = {"Mary","John","Emma"};
       int[] heights = {180,165,170};
       String[] res = sortPeople(names, heights);
       printArray(res);
    }



    public static String[] sortPeople(String[] names, int[] heights) {
      int n = names.length;
      String[] res = new String[n];
      ArrayList<String> list = new ArrayList<>();

      //sort by heights
      //put those names in an arraylist
      //reverse the arraylist

      TreeMap<Integer,String> tmap = new TreeMap<>();

      for(int i=0;i<n;i++){
        tmap.put(heights[i], names[i]);
      }

      for(String values : tmap.values()){
        list.add(values);
      }

      Collections.reverse(list);

      for(int i=0;i<n;i++){
        res[i]=list.get(i);
      }
      return res;
    }

    public static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
