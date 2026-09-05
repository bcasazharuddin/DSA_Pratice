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

public class deletteHeadLinkedList {
    public Node deleteHead(Node head) {
        // code here
        if(head == null){
            return head;
        }else{
            return head.next;
        }
    }
}