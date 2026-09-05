package LinkedList;

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
public class insertAtEndLinkedList {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x);
        if(head == null){
            head = temp;
            return head;
        }
        
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        
        return head;
    }
}
