import java.util.*;
public class distinctelements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6};
        count_distinct_el_subarray(nums ,3);

    }

    public static void count_distinct_el_subarray(int[] nums, int k){
        int count = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=0;
        int i=0;
        int set_size=0;
        int n = nums.length;


        while(j<n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            if (j-i+1<k) {
                j++;
            } 
            else if(j-i+1==k) {
                
                count = map.size();
                System.out.println(count);

                
                if (map.get(nums[i]) == 1) {
                    map.remove(nums[i]);
                } else {
                    map.put(nums[i], map.get(nums[i]) - 1);
                }
                i++;
                j++;
            }
        }
            }
        }
    
       
    
      

