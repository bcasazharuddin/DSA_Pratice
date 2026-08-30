package LinkedList;
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}


public class traversingLinkedList {
    void printList(Node head) {
        // code here
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
