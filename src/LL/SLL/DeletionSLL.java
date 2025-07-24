package LL.SLL;

/**
 * Check if the head is NULL.
 * If it is, return NULL (the list is empty).
 * Store the current head node in a temporary variable temp.
 * Move the head pointer to the next node.
 * Delete the temporary node.
 * Return the new head of the linked list.
 */
public class DeletionSLL {
    public static Node deleteAtBeginning(Node head){
        if (head == null) return null;       // If list is empty
        return head.next;
    }
    public static Node deleteAtEnd(Node head){
        if(head == null) return null;
      /*  if (head.next.next == null){
            head.next = null;
        }*/
        if (head.next == null) {
            return null;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete the last node
        secondLast.next = null;
        return  head;
    }
    public static Node deleteNodeInMiddle(Node head, int position){
        Node curr = head;
        Node prev = null;

        if(curr == null) return null;
        if(position == 1){
            curr = curr.next;
            return curr;
        }
        for(int i = 0; curr != null && i < position; i++){
            prev= curr;
            curr= curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        else {
            System.out.println("Data not present");
        }

        return curr;
    }
    public static void printTheList(Node head){
        Node curr= head;
        while (curr != null){
            System.out.println(curr.data +"");
            curr= curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(2430);
        head.next.next.next.next = new Node(240);
        System.out.println("Original Linked List:");
        printTheList(head);

        head = deleteAtBeginning(head); // Important: assign the returned head

        System.out.println("After deleting at beginning:");
        printTheList(head);
        System.out.println("After deleting at End:");
        head = deleteAtEnd(head);
        printTheList(head);
        head= deleteNodeInMiddle(head,2);
        printTheList(head);

    }
}
