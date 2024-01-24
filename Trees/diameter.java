public class diameter {
    public static void main(String[] args) {
TreeNode root = new TreeNode(1);
root.left=new TreeNode(2);
root.right=new TreeNode(3);
root.right.right=new TreeNode(7);
root.right.right.right=new TreeNode(8);
root.right.right.right.right=new TreeNode(9);
root.right.left=new TreeNode(4);
root.right.left.left=new TreeNode(5);
root.right.left.left.left=new TreeNode(6);

int res = diameter_of_bin_Tree(root);
System.out.println(res);

    }

    public static int diameter_of_bin_Tree(TreeNode root) {
        int maxi=0;

        if (root == null) {
            return 0;
        }

        int LH = findLeftHeight(root.left);
        int RH = findRightHeight(root.right);

         maxi = Math.max(maxi, LH+RH);

         diameter_of_bin_Tree(root.left);
         diameter_of_bin_Tree(root.right);

return maxi+1;
    }

    public static int findLeftHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight = findLeftHeight(root.left);
        return leftHeight+1;
    }

    public static int findRightHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int rightHeight = findLeftHeight(root.left);
        return rightHeight+1;
    }
}
