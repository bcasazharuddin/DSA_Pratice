package LinkedList;
/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

public class deletedEndLinkedList {
    public Node removeLastNode(Node head) {
        // code here
        if(head == null){
            return null;
        }
        
        if(head.next == null){
            return null;
        }
        
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        
        curr.next = null;
        return head;
    }
}