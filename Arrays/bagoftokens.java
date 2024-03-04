import java.util.*;
public class bagoftokens {
    public static void main(String[] args) {
        int[] tokens = {100,200,300,400};
        int power = 200;
        int res = bagoftokens_(tokens, power);
        System.out.println(res);
    }


    public static int bagoftokens_(int[] tokens,int power){
        int score=0;
        int res =0;
        int n = tokens.length;
        if(n==1 && tokens[0]>power){ //cannot perform face down when score = 0;
            return 0;
        }
        Arrays.sort(tokens);
        int l = 0;
        int r = n-1;
       
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                l++;
                res=Math.max(res, score);
            }
            else if(score>0){
              power+=tokens[r];
              score--;
              r--;
            }else{
                break;
            }
           }   
        
        return res;
    }
}
