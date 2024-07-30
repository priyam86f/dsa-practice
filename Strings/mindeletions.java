public class mindeletions {
 public static void main(String[] args) {
    String s = "b";
    int res = minimumDeletionsToMakeStringBalanced(s);
    System.out.println(res);
 }  
 
 public static int minimumDeletionsToMakeStringBalanced(String s){
    /*a balanced string is the one which has all a's to its left and all b's to its right */
    int n = s.length();
     //count the number of a's in the string
     int a_count_right = 0;
     for(int i=0;i<n;i++){
        if(s.charAt(i)=='a'){
            a_count_right++;
        }
     }
int res = s.length();
int b_count_left=0;

     for(int i=0;i<n;i++){
        if(s.charAt(i)=='a'){
            a_count_right--;
        
        }
        res = Math.min(res,a_count_right + b_count_left );
         if(s.charAt(i)=='b'){
            b_count_left++;
            
        }
     }
     return res;

     
 }
}
