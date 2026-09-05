/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class insertAtFrontedLinkedList {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
}