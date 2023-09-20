import java.util.Arrays;
import java.util.*;

public class minops {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int res = min_operations(nums, 5);
        System.out.println(res);
    }


    public static int min_operations(int nums[],int x){
        int count = 0;
        int sum=0;

        Arrays.sort(nums);
        reverse(nums);

        while(sum==x){
            int i=0;
            sum+=nums[i];
            count++;
            i++;
        }
        System.out.println(sum);
        return count;
    }


    public static void reverse(int[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            int temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
}
