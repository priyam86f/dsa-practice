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
    public int height_balanced(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = height_balanced(root.left);
        int right = height_balanced(root.right);

        if(left==-1||right==-1){
            return -1;
        }

        if(Math.abs(left-right)>1){
            return -1;
        }

        return 1+Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }

        if(height_balanced(root)!=-1){
            return true;
        }
        return false;
    }
}