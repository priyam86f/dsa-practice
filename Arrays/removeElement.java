public class removeElement {
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,4,5,6,7,3,3,7,4};
        /*write an algorithm to move val to the end
         * of array. NOTE - order of element does not matter.
         * Also return the length of the new array excluding the val.
         */
        int res = remove_el(nums, 3);
        System.out.println(res);
        
    }

    public static int remove_el(int[] nums, int val){
        int i=0;
        int k=0;
        int n = nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
       
        return k;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"");
        }
    }
}
