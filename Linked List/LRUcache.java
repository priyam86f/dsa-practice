import java.util.*;
class Node{
    int key;
    int val;
    Node next=null;
    Node prev=null;

    public Node(int key,int val){
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
public class LRUcache {
    int cap;
    Map<Integer,Node> cache;
    Node left;
    Node right;

    public LRUcache(int capacity){
        this.cap=capacity;
        this.cache=new HashMap<>();
        this.left=new Node(0, 0);
        this.right=new Node(0, 0);
        this.left.next=right;
        this.right.prev=left;
    }

    public void remove(Node node){
      Node prev = node.prev;
      Node next = node.next;
      prev.next=next;
      next.prev=prev;
    }

    public void insert(Node node){
        Node prev = this.right.prev;
        prev.next=node;
        //backward linking
        node.prev=prev;
        node.next=this.right;
        this.right.prev=prev;
    }

    public int get(int key){
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key,int val){
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.val=val;
            remove(node);
            insert(node);
        }
        else if(cache.size()==cap){
            Node removeLeastRecentlyUsed = this.left.next;
            cache.remove(removeLeastRecentlyUsed.key);
            remove(removeLeastRecentlyUsed);

        }
        Node newnode = new Node(key, val);
        cache.put(key, newnode);
        insert(newnode);
        
    }
    public void printCacheContents() {
        System.out.println("LRU Cache Contents:");
        Node current = this.left.next;
        while (current != this.right) {
            System.out.println("Key: " + current.key + ", Value: " + current.val);
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LRUcache lruCache = new LRUcache(3);
     

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

        lruCache.printCacheContents();

        lruCache.get(2);

        lruCache.printCacheContents();

        lruCache.put(4, 4);

        lruCache.printCacheContents();
    }
    
}



