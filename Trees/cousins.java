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
    public boolean isCousins(TreeNode root, int x, int y) {
        //same level. different parents.
        //
        //we can store the level order traversal of all levels

        //..then check if x and y belong to the same list

        //..also store the parents of all nodes to check if same parent is present.

        //lvl order traversal + hashmap..!!!

        HashMap<Integer,Integer> levelMap = new HashMap();
        HashMap<Integer,Integer> parentMap = new HashMap();

        Queue<TreeNode> q = new LinkedList();

        q.add(root);

        levelMap.put(root.val,0);
        parentMap.put(root.val,0);

        while(!q.isEmpty()){
            TreeNode node = new TreeNode();
            node = q.poll();

            if(node.left!=null){
                q.add(node.left);
                levelMap.put(node.left.val,levelMap.get(node.val)+1);
                parentMap.put(node.left.val,node.val);
            }

            if(node.right!=null){
                q.add(node.right);
                levelMap.put(node.right.val,levelMap.get(node.val)+1);
                parentMap.put(node.right.val,node.val);
            }

            if(levelMap.get(x)==levelMap.get(y) && parentMap.get(x)!=parentMap.get(y)){
                return true;
            }
            
        }
        return false;

    }
}