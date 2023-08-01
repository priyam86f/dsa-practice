public class VariableSW {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int res = varSW(num, 3);
        System.out.println(res);
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
                    
                    int subarrayLength = j - i+1 ;
                   ans = Math.max(ans, subarrayLength);
                    
                }
                
            }
            
            
        }
        return ans;
    }
}
