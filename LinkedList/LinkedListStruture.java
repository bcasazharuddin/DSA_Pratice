package LinkedList;

public class LinkedListStruture {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        System.out.println(head.data+"--->"+temp1.data+"--->"+temp2.data);
    }
}