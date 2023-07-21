/*Find out How many times does the target occur */
public class frequency {
    public static void main(String[] args) {
        int[] nums = {2,4,6,6,6,6,6,8,10};
        int res = freq_count(nums, 6);
        System.out.println(res);
    }


    public static int freq_count(int[] nums,int target){
        int x = FIRST_OCCURENCE(nums, target);
        int y = LAST_OCCURENCE(nums, target);
        int result = y - x + 1;
        return result;
    }

    public static int FIRST_OCCURENCE(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int res=0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(target==nums[mid]){
                res=mid;
                high=mid-1;
            }

            if(target>nums[mid]){
              low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
               
            }
        }
        return res;
    }



    public static int LAST_OCCURENCE(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int res=0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(target==nums[mid]){
                res=mid;
                low=mid+1;
            }

            if(target>nums[mid]){
              low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
               
            }
        }
        return res;
    }
}
