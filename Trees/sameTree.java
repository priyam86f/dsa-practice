import java.util.*;
public class sameTree {

    int data;
    sameTree left;
    sameTree right;

    public sameTree(int key){
        data=key;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        sameTree root = new sameTree(1);
        root.left=null;
        root.right=new sameTree(3);

        sameTree root2= new sameTree(1);
        root2.left=new sameTree(2);
        root2.right=new sameTree(3);
 
       same_tree(root, list1);
       same_tree(root2, list2);

       boolean res = list1.equals(list2);
        System.out.println(res);
    }


    public static void same_tree(sameTree root, List<Integer> res){
        if(root==null){
            res.add(null);
            return;
        }
        
         res.add(root.data);
         same_tree(root.left, res);
         same_tree(root.right, res);
    }
}
