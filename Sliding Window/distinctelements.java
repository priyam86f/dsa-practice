import java.util.*;
public class distinctelements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6};
        count_distinct_el_subarray(nums ,3);

    }

    public static void count_distinct_el_subarray(int[] nums, int k){
        int count = 0 ;
        HashSet<Integer> set = new HashSet<>();
        int j=0;
        int i=0;
        int n = nums.length;
        
        while(j<n){
            set.add(nums[j]); //base condition
    
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                //work on the base condition
                count = set.size();
                set.remove(nums[i]);
                System.out.println(count);
                i++;
                j++;
            }
        }
    
      }
}
