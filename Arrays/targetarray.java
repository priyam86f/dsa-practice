import java.util.ArrayList;

public class targetarray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] res = createTargetArray(nums, index);
        printArray(res);
    }


    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> target_list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           target_list.add(index[i], nums[i]);
        }

        //convert list to array

        for(int i=0;i<nums.length;i++){
            target[i]=target_list.get(i);
        }

        return target;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
