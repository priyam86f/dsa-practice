import java.util.*;
/*LeetCode 561. Array Partition.
It is clearly mentioned in the question itself, that the array is going to contain "2n" integers.
 Which means, our array length = 2n. 
Again,they have asked us in the question to generate "n" pairs. 
So,if we sort the array...

Approach
Once the array is sorted, the minimum elements for each pair will appear at the even indexes.
let us consider this simple example.
nums = [1,2,3,4];
nums[0] = 1
which is the minimum amongst {1,2}

similarly,

nums[2] = 3;
which is the minimum amongst {3,4}

hence, 1+3=4 is the answer.
*/

public class minPairsMaxSum {
    public static void main(String[] args) {
        int[] nums = {6,7,8,9};
        int res = maxSum(nums);
        System.out.println(res);
    }

    public static int maxSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;

        for(int i=0;i<nums.length;i+=2){
            sum +=nums[i];
        }
return sum;
    }
}
