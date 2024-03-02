import java.util.ArrayList;
import java.util.List;

public class squaresofsortedarr {
    public static void main(String[] args) {
        int[] array = {-7,-3,2,3,11};
        int[] res = squares_Of_a_sorted_array(array);
        printArray(res);
    }


    public static int[] squares_Of_a_sorted_array(int[] nums){
        int n = nums.length;
        List<Integer> resList = new ArrayList<>();
        List<Integer> revList = new ArrayList<>();
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                resList.add(nums[l] * nums[l]);
                l++;
            } else {
                resList.add(nums[r] * nums[r]);
                r--;
            }
        }
//reverse
for(int i=n-1;i>=0;i--){
revList.add(resList.get(i));
}
        
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = revList.get(i);
        }

        return res;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
