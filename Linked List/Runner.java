public class Runner {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.insert(5);
        mylist.insert(4);
        mylist.insert(2);
        mylist.insert(1);
        mylist.insertAtStart(6);
        mylist.insertAtMiddle(0, 55);
        mylist.show();
        mylist.deleteAt(3);
        mylist.show();
    }
}
