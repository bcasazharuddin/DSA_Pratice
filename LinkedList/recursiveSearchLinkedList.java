package LinkedList;
    
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

public class recursiveSearchLinkedList {
    public boolean searchKey(Node head, int key) {
        // Code here
        if(head == null){
            return false;
        }
        if(head.data == key){
            return true;
        }else{
            return searchKey(head.next , key);
        }
        
        
    }
}
