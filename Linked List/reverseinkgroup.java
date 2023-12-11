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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode groupPrev = dummy;
        while(true){
        //step 1 - find the kth element
        ListNode kth = getkthnode(groupPrev,k);
        if(kth==null)
        break;

//step 2 - adjust the pointers
        ListNode groupNext = kth.next;

        //Step 3 - reversal
        ListNode prev = kth.next;
        ListNode curr = groupPrev.next;

        while(curr!=groupNext){
            ListNode tmp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }

        //step 4 - adjust the pointers kth and groupPrev

        ListNode tmp = groupPrev.next;
        groupPrev.next = kth;
        groupPrev=tmp;

        
        }
        
return dummy.next;
    }

    public ListNode getkthnode(ListNode node, int k){
        for(int i=0;i<k;i++){
            if(node==null)
            return null;
            node = node.next;
        }
        return node;
    }
}