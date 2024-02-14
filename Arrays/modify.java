public class modify {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] res = rearrangeArray(nums);
        printArray(res);

    }

    public static int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=1;
 
        int[] sol = new int[nums.length];
 
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
              sol[i] = nums[k];
              i+=2;
            }else{
                sol[j] = nums[k];
              j+=2;
            }
        }
        return sol;
     }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }
    }
}
