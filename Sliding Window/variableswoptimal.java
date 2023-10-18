public class variableswoptimal {
   public static void main(String[] args) {
    int[] nums = {4,1,1,1,2,1,5};
    int res = varsw(nums, 6);
    System.out.println(res);
   }
   
   
   public static int varsw(int[] nums,int k){
    int n = nums.length;
    int sum=0;
    int max=0;
    int i=0;
    int j=0;
    
    while(j<n){
        sum+=nums[j];

        if(sum<k){
            j++;
        }
        else if(sum==k){
         max = Math.max(max, j-i+1);
    
         j++;
        }
        //first we need to check if sum increased now or not
        //only then we can define a condition for i++

         if(sum>k){
            while(sum>=k){
                sum-=nums[i];
                i++;
            }
            j++;
         }
         
        
        }
       
    
    return max;
}
}
