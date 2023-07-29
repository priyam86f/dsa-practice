public class finalValAfterOperations {
    public static void main(String[] args) {
        String[] chars = {"--X","X++","X++"};
        int res = operate(chars);
        System.out.println(res);
    }


    public static int operate(String[] operations){
        int x = 0;
        for(int i=0;i<operations.length;i++){
        String element = operations[i];
        if(element.equals("X++")||element.equals("++X")){
            x+=1;
        }else{
            x-=1;
        }
       
        }
        return x;
    }
}
