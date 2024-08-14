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
    public int goodNodes(TreeNode root) {
        int count=0;
        count = count_good_nodes_bt( root,Integer.MIN_VALUE);
        return count;
    }

    public static int count_good_nodes_bt(TreeNode root,int maxNode){
        if(root==null){
            return 0;
        }
 int count=0;

       if(root.val >= maxNode){
        count = 1;
        maxNode= root.val;
       }
  count+=count_good_nodes_bt(root.left,maxNode);
  count+=count_good_nodes_bt( root.right, maxNode);

  return count;

    }
}