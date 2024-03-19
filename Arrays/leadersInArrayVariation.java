public class leadersInArrayVariation {
    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        int[] res = variation_of_leaders_in_arr(nums);
         printArray(res);
    }   
    
    
    
    public static int[] variation_of_leaders_in_arr(int[] nums){
        /*This is a variation of the famous leaders in array problem, where instead of just printing the 
         * leaders we also print every leader for that element to that right. 
         * The problem also demands to put -1 at the end of array so that is done only because of that.
         */
        int temp=0;
        int max=-1;
    
        for(int i=nums.length-1;i>=0;i--){
            temp = nums[i];
            nums[i] = max;
            max = Math.max(max, temp);
        }
    
        return nums;
    }
    
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
    }