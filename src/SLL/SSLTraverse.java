package SLL;

/**
 * Traversal of Singly Linked List
 * Traversal in a linked list means visiting each node and performing operations like printing or processing data.
 *
 * Step-by-step approach:
 *
 * Initialize a pointer (current) to the head of the list.
 * Loop through the list using a while loop until current becomes NULL.
 * Process each node (e.g., print its data).
 * Move to the next node by updating current = current->next.
 */
public class SSLTraverse {
    public static void SSLTraverseList(Node head){
        /*while (head != null){
            System.out.print(head.data+ "====> ");
            head = head.next;
        }*/
        //singly linked list using recursion
        if(head== null) return;

        System.out.print(head.data+ "====> ");
        SSLTraverseList(head.next);


    }
    public static void main(String[] args) {


        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Example of traversing the node and printing
        SSLTraverseList(head);
    }
}
