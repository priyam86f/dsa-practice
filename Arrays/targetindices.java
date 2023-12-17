import java.util.*;
public class targetindices {
    public static void main(String[] args) {
        int[] nums = {5,1,2,3,3,3,2};
        int target=2;
        List<Integer> res = targetIndices(nums, target);
        System.out.println(res);
    }


    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               li.add(i);
            }
        }
        return li;
       }
}
