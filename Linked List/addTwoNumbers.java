public class addTwoNumbers {
    
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode dummy = new ListNode();
          ListNode curr = dummy;
          int carry=0;

          while(l1!=null || l2!=null || carry!=0){
             int digit1 = (l1!=null) ? l1.val : 0;
             int digit2 = (l2!=null) ? l2.val : 0;

             int sum = digit1+digit2+carry;
             carry=sum/10;
             sum=sum%10;

             curr.next = new ListNode(sum);
             curr = curr.next;

             l1 = (l1!=null) ? l1.next : null;
             l2 = (l2!=null) ? l2.next : null;

          } 
          return dummy.next;
        }
    }

    

