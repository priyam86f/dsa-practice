public class occurence {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,8,8,10,12,14};
        int[] res = occ(nums, 8);
        printArray(res);
    }

    public static int[] occ(int[] nums,int target){
        
        int[] arr = new int[2];
        arr[0]=FIRST_OCCURENCE(nums, target);
        arr[1]=LAST_OCCURENCE(nums, target);
        return arr;

        
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

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
