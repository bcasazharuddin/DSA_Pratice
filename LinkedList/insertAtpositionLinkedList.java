package LinkedList;

/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
public class insertAtpositionLinkedList {
    public Node insertPos(Node head, int pos, int val) {
        Node temp = new Node(val);
        if(head == null){
            if(pos == 1){
                return temp;
            }else{
                return head;
            }
        }
        // code here
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        
        
        Node curr = head;
        for(int i=1;i<=pos-2 && curr != null;i++){
            curr = curr.next;
        }
        
        if(curr == null){
            return head;
        }
        
        
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}