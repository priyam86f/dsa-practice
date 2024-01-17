import java.util.Arrays;
import java.util.HashMap;

class uniqueOccurence{
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        boolean res = uniqueOccurrences(nums);
        System.out.println(res);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        /*put the values in a hashmap, then store them in an array
        sort the array and check*/

        HashMap<Integer,Integer> map = new HashMap();

        int[] arr2 = new int[map.size()];

        //inserting in map
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Integer[] valuesArray = map.values().toArray(new Integer[0]);

        Arrays.sort(valuesArray);

        for(int i=0 ;i<valuesArray.length-1;i++){
            if(valuesArray[i]==valuesArray[i+1]){
                return false;
            }
        }
        return true;
   
    }
}