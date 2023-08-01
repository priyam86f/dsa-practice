public class numOfSubarrays {
    public static void main(String[] args) {
        int[] res = {1,2,1,2,1};
        int ans = varSW(res, 3);
        System.out.println(ans);
    }



    public static int varSW(int[] nums,int sum){
        int n = nums.length;
        int res=0;
        int ans=0;
        int count=0;

        for(int i=0;i<n;i++){
           int fsum=0;
            for(int j=i;j<n;j++){
                fsum+=nums[j];
                if(fsum==sum){
                    
                    count++;
                    
                }
                
            }
            
            
        }
        return count;
    }
}
