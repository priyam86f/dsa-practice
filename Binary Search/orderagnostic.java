//order not known Binary Search i.e. whether the input array is
//ascending or descending
public class orderagnostic {
    public static void main(String[] args) {
        int[] nums = {20,18,16,14,12,10,8,6,4,2};
        int res=0;

        
            if(nums[0]<nums[nums.length-1]){
                res = ASCENDING_BINARY_SEARCH(nums, 10);
                System.out.println(res);
            }
            else if(nums[0]>nums[nums.length-1]){
                 res = DESCENDING_BINARY_SEARCH(nums, 10);
                 System.out.println(res);
            }
        
    }

    /*Call this function if nums[0]<nums[n-1] */
    public static int ASCENDING_BINARY_SEARCH(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2; //avoids integer overflow.

            if(target==nums[mid]){
                return mid;
            }
            else if(target>=nums[mid]){
                low=mid+1;
            }
            else if(target<=nums[mid]){
                high=mid-1;
            }
        }
return -1; //if element not found..
    }


     /*Call this function if nums[0]>nums[n-1] */
     
     public static int DESCENDING_BINARY_SEARCH(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2; //avoids integer overflow.

            if(target==nums[mid]){
                return mid;
            }
            else if(target<=nums[mid]){
                low=mid+1;
            }
            else if(target>=nums[mid]){
                high=mid-1;
            }
        }
return -1; //if element not found..
    }

}
