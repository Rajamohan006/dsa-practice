package DLL;

public class DLLInsertion {
    static Node deleteAtEnd(Node head){

        return head;
    }
    static Node deleteAtASpecificPosition(Node head, int position){
        Node newNode = head;
        return newNode;
    }
    static Node deleteAtBeginning(Node head){
        if (head == null) return null;  // List is empty

        Node newHead = head.next;

        if (newHead != null) {
            newHead.prev = null;
        }

        // Optional: clear old head's next to fully unlink
        head.next = null;

        return newHead;
    }
    static Node insertionAtSpecificPosition(Node head, Node newNode, int position){
        if (position < 1) {
            System.out.println("Invalid position");
            return head;
        }

        if (head == null && position > 1) {
            System.out.println("List is empty. Can only insert at position 1.");
            return head;
        }

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            return newNode;
        }
        Node curr = head;
        int count = 1;

        while (curr != null && count < position - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            System.out.println("Position exceeds list length.");
            return head;
        }
        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;

        return head;
    }
    static int findsize(Node head){
        int size = 0;
        while (head != null){
            head = head.next;
            size++;
        }
        return size;
    }
    static Node InsertionAtEnd(Node head, Node newNode) {
        Node curr = head;
        if (curr == null) return newNode;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return newNode;
    }

    static Node insertionAtStart_DLL(Node head, Node newNode) {
        if (head == null) return newNode;

        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    static void forwardTraversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static void reverseTraversal(Node tail) {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the initial list: 1 <-> 2 <-> 3
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node new_Node = new Node(4);
        Node new_Node_end = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        // Get tail for reverse traversal
        Node tail = third;

        System.out.print("Reverse Traversal: ");
        reverseTraversal(tail);

        System.out.print("Forward Traversal: ");
        forwardTraversal(head);

        // Insert new node at the beginning
        head = insertionAtStart_DLL(head, new_Node);

        System.out.print("After Insertion at Beginning: ");
        forwardTraversal(head);
        System.out.print("After Insertion at End: ");
        InsertionAtEnd(head, new_Node_end);
        forwardTraversal(head);
        Node new_Node_middle = new Node(6);

        System.out.print("After Insertion at Specific position: ");
        insertionAtSpecificPosition(head, new_Node_middle,2);
        forwardTraversal(head);

        System.out.print("After Deleting at Beginning: ");
        deleteAtBeginning(head);
        forwardTraversal(head);

    }
}