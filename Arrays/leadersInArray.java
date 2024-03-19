import java.util.ArrayList;
import java.util.*;
public class leadersInArray {
    public static void main(String[] args) {
        int[] nums = { 16, 17, 4, 3, 5, 2};
        int[] res = leaders_in_array_optimal(nums);
        printArray(res);
        
    }

    public static int[] leaders_in_array_brute(int[] nums){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        // Traverse the array from left to right
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Check if the current element is greater than all elements to its right
            for (int j = i + 1; j < n; j++) {
                if (nums[i] <= nums[j]) {
                    isLeader = false;
                    break;
                }
            }

            // If it's a leader, add it to the list
            if (isLeader) {
                list.add(nums[i]);
            }
        }

        // Convert ArrayList to array
        int[] res = new int[list.size()];
        for(int k=0;k<res.length;k++){
            res[k] = list.get(k);
        }
        return res;
    }


//16, 17, 4, 3, 5, 2 is nums[i] greater than the elements to its right?

    public static int[] leaders_in_array_optimal(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int n = nums.length;
        

        for(int i=n-1;i>=0;i--){
            //starting from the behind
            if(nums[i]>max){   //if nums[i] is greater than the current max element in the window then its a leader
                list.add(nums[i]);
            } 
            max = Math.max(max,nums[i]);

        }
        int[] res = new int[list.size()];
        for(int k=0;k<res.length;k++){
            res[k] = list.get(k);
        }
        
        return res;
    }


    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}

