public class Sort_By_Parity{
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sort_by_parity(nums);
        printarr(res);
    }



    public static int[] sort_by_parity(int[] nums){
        int n = nums.length;
       
       int i = 0;
       int j = n-1;
            while(i<j){
                /*If i is even, it skips the iteration by i++ */
                while(i<j && nums[i]%2==0)
                i++;
                
                /*If j is even, it skips the iteration by j++ */
                while(i<j && nums[j]%2==1)
                j--;
 
                /*If the iteration was skipped, it means swap was performed
                 * since the value was odd.
                 */
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        


        
        return nums;
    }

    public static void printarr(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}