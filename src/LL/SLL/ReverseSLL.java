package LL.SLL;
/*
public class ReverseSLL {
    static Node reverseList(Node head){
        Node curr = head, prev = null, next;
        while (curr !=null){
            next = curr.next;
            curr.next = prev;

            prev= curr;
            curr= next;
        }
        return prev;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.print("Given Linked list:");
        printList(head);

        head = reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }

}*/

/**
 * Given a singly linked list, the task is to find the middle of the linked list.
 * If the number of nodes are even, then there would be two middle nodes, so return the second middle node.
 */
class FindMiddleoftheLinkedList{
    static int findNodes(Node head){
        int size= findSize(head);
        if(size == 1) return head.data;
       int mid= size/2;
       while (mid>0){
           head= head.next;
           mid--;
       }
       return head.data;
    }
    static int findSize(Node head){
        Node curr = head;
        int size=0;
        while (curr != null){
            size++;
            curr= curr.next;
        }
        return size;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.print("Given Linked list:");
       // printList(head);

         int node= findNodes(head);

        System.out.print("Mid value:" + node);
       // printList(node);
    }
}
