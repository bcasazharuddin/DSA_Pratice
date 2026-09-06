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

public class iterativeSearchLinkedList {
    public boolean searchKey(Node head, int key) {
        // Code here
        int pos =1;
        Node curr = head;
        while(curr != null){
            if(curr.data == key){
                return true;
            }else{
                pos++;
                curr = curr.next;
            }
        }
        return false;
    }
}