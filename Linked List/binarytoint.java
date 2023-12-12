public class binarytoint {
    
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
       int sum = 0;


        ListNode node = new ListNode();

        while(head!=null){
            sum*=2;
            sum+=head.val;
            head=head.next;
        }

        return sum;
    }
}