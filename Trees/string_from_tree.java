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
    public String tree2str(TreeNode root) {  
         if(root==null){
            return "";
         }

         StringBuilder sb = new StringBuilder();
         preOrder_String_from_tree( root, sb);
         return sb.length() > 0 ? sb.substring(1,sb.length()-1) : "";

    }

    public static void preOrder_String_from_tree(TreeNode root,StringBuilder res){
        if(root==null){
            return;
        }

        res.append('(');
        res.append(root.val);

        if(root.left==null && root.right!=null){
            res.append("()");
        }

        preOrder_String_from_tree(root.left,res);
        preOrder_String_from_tree(root.right,res);
        res.append(')');
        
    }
}