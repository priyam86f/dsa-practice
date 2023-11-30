public class mergeKsortedLists {
    
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
    public ListNode mergeKLists(ListNode[] lists) {
        //pickup two lists at a time, merge them using the
        //helper function and store the merged list in the new 
        //array of lists..

        if(lists==null || lists.length==0){
            return null;
        }

        while(lists.length > 1){
            ListNode mergedLists[] = new ListNode[(lists.length+1)/2];
            int mergedIDX = 0;

            for(int i=0;i<lists.length;i+=2){
                    ListNode l1=lists[i];
                    ListNode l2= (i+1) < lists.length ? lists[i+1] : null;

                    mergedLists[mergedIDX++]=mergeTwolists(l1,l2);
            }
            lists=mergedLists;
        }
        return lists[0];

    }





    public ListNode mergeTwolists(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                tail.next=list1;
                list1=list1.next;
            }else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1!=null){
            tail.next=list1;
        }else{
            tail.next=list2;
        }
        return dummy.next;
    }
}
