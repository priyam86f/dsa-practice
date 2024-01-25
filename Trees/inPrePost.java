/*construct binary tree from inorder,preorder
 * as well as postorder traversals
 * three in one traversal
 */

 //pair to store in Stack

import javax.xml.transform.stax.StAXResult;

import java.util.*;

class Pair{
    Node node;
    int data;

    public Pair(Node node, int data){
        this.data=data;
        this.node=node;
    }
}
 public class inPrePost {

    public static void main(String[] args) {
        Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right= new Node(5);
       root.left.right.left = new Node(8);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
       root.right.right.left=new Node(9);
       root.right.right.right=new Node(10);
       inPrePost_traversals(root);
    }


    public static void inPrePost_traversals(Node root){
        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(root, 1));
        List<Integer> preOrderTraversal = new ArrayList<>();
        List<Integer> postOrderTraversal = new ArrayList<>();
        List<Integer> inOrderTraversal = new ArrayList<>();

        while (!stack.isEmpty()) {
            Pair it  = stack.pop();
            if(it.data==1){
                preOrderTraversal.add(it.node.data);
                it.data++;
                stack.push(it);

                if(it.node.left!=null){
                    stack.push(new Pair(it.node.left, 1));
                }
            } else if(it.data==2){
                inOrderTraversal.add(it.node.data);
                it.data++;
                stack.push(it);

                if(it.node.right!=null){
                    stack.push(new Pair(it.node.right, 1));
                }
            }else{
                postOrderTraversal.add(it.node.data);
            }
        }

        System.out.println("PreOrder Traversal-"+preOrderTraversal);
        System.out.println("InOrder Traversal-"+inOrderTraversal);
        System.out.println("PostOrder Traversal-"+postOrderTraversal);

    }
    
}
