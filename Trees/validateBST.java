/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
       inorderTraversal(root, inorderList);

       for (int i = 1; i < inorderList.size(); i++) {
            if (inorderList.get(i) <= inorderList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void inorderTraversal(TreeNode root, List<Integer> inorder_list){
        if(root==null){
            return;
        }

        inorderTraversal(root.left,inorder_list);
        inorder_list.add(root.val);
        inorderTraversal(root.right,inorder_list);
    }
}