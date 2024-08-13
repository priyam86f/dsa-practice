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
    public List<Integer> rightSideView(TreeNode root) {
       ArrayList<Integer> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList();

        if(root==null){
            return result;
        }

        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                TreeNode node = q.poll();
                if (node != null) {
                    if (i == len - 2) {  // Add the last node of each level
                        result.add(node.val);
                    }
                    if (node.left != null) {
                        q.offer(node.left);
                    }
                    if (node.right != null) {
                        q.offer(node.right);
                    }
                }
            }
        }

        return result;
    }
}