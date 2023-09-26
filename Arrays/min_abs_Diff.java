public class min_abs_Diff {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int res = diff(nums, 2);
        System.out.println(res);
    }


    public static int diff(int[] nums,int k){
        int count=0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
              if(Math.abs(nums[j]-nums[i])==k){
                count++;
              }
            }
        }
        return count;
    }
}
