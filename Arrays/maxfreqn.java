import java.util.HashMap;

public class maxfreqn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = maximumFrequency(arr);
        System.out.println(res);
    }


    public static int maximumFrequency(int[] nums){
        int max = 0;
        int max_counter=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        /*1. what is the max frequency?
           2. then log the keys corresponding to that max frequency
           3. result is num of keys * max frequency */
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        // operation on hashmap : now we need the max value, and number of keys corresponding to it.
        //if there is another element with the same value then increment the counter.

        

        for (int frequency : map.values()) {
            max = Math.max(max, frequency);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                max_counter++;
            }
        }
       
        return max_counter*max;
    }
}
