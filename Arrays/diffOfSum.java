public class diffOfSum {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        int res = differenceOfSum(nums);
        System.out.println(res);
    }


    public static int differenceOfSum(int[] nums) {
        int el_sum = 0;
        int dig_sum = 0;
        int tens_index=0;
        int res=0;
     
 
        //first finding the elements sum.
 
        for(int i=0;i<nums.length;i++){
          el_sum+=nums[i];

          //find the digits sum
          res = nums[i];
          int x=0;
          while(res>0){
           x = res % 10;
           dig_sum+=x;
           res/=10;

          }
        } 
       
 
 
        return Math.abs(el_sum-dig_sum);
     }
}
