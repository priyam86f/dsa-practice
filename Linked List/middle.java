public class middle {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        Node middleNode = findthemiddle(list1.head);

        // Print the value of the middle node
        System.out.println("Middle Node Value: " + middleNode.data);
    }

    public static Node findthemiddle(Node head){
        int count=1;
        Node slow = head;
        Node fast = head.next;

        Node n = head;

        while(n.next!=null){
            count++;
            n=n.next;
        }

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(count%2==0){
            return slow.next;
        }else{
            return slow;
        }
    }

    public static void printList(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
