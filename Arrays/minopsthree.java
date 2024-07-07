public class minopsthree {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int res = minimumOperations(nums);
        System.out.println(res);
    }


    public static int minimumOperations(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        return count;
    }
}
