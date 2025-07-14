package SLL;

/**
 * Steps to find the length of the Linked List:
 *
 * Initialize count as 0.
 * Initialize a node pointer, curr = head.
 * Do following while curr is not NULL
 * curr = curr -> next
 * Increment count by 1.
 * Return count.
 */
public class SSLLength {
    static int length(Node head){
        int length = 0;
        /*while (head != null){
            length++;
            head = head.next;
        }*/
        if(head == null) return length;

        return 1+ length(head.next);
    }
    public static void main(String []args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        length(head);
        System.out.println("Count of nodes is "
                + length(head));
    }
}
