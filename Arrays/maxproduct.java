import java.util.*;
public class maxproduct {
    /*Given the array of integers nums, 
    you will choose two different indices i and j of that array.
     Return the maximum value of (nums[i]-1)*(nums[j]-1). */
    public static void main(String[] args) {
        int[] res = {2,3,4,1,5,6};
        int ans = maxProduct(res);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int i=n-1;
        int j=n-2;
        Arrays.sort(nums);
        int res = (nums[i] - 1) * (nums[j] - 1);
        return res;
    }
}
