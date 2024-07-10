public class crawlerlogfolder {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        int res = minOperations(logs);
        System.out.println(res);
    }

    public static int minOperations(String[] logs) {
        int n = logs.length;
        int res=0;

        for(int i=0;i<n;i++){
            if(logs[i].equals("./")){
                continue;
            }else if(logs[i].equals("../")){
                if(res>0){
                    res-=1;
                }
            }else{
                res++;
            }
        }
        return res;
    }
}
