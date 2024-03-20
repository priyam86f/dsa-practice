public class firstAndLastOcc{
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,8,8,9,9,10};
        int[] nums2 = new int[2];
        nums2[0] = first_occurence(nums, 8);
        nums2[1]=last_occurence(nums, 8);
        printArray(nums2);

    }



    public static int first_occurence(int[] nums, int target){
        int res = -1;
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                res = mid;
                high=mid-1; //to find the last occurence, shift the search to low=mid+1;
            }else if(target>=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }

    public static  int last_occurence(int[] nums, int target){
        int res = -1;
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                res = mid;
                low=mid+1; //to find the last occurence, shift the search to low=mid+1;
            }else if(target>=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"");
        }
    }
}