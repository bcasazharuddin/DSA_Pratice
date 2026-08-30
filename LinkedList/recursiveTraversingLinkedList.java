package LinkedList;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class recursiveTraversingLinkedList {
    void printList(Node head) {
        // code here
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        printList(head.next);
    }
}
