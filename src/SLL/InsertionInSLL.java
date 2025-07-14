package SLL;

/**
 * Algorithm:
 *
 * Make the first node of Linked List linked to the new node
 * Remove the head from the original first node of Linked List
 * Make the new node as the Head of the Linked List.
 */
public class InsertionInSLL {
    public static Node insertionAtBeginning(Node head,int new_Node){
        Node newNode= new Node(new_Node);
        newNode.next = head;
        return newNode;

    }
    public static Node insertionAtEnd(Node head,int new_Node){
        Node newNode = new Node(new_Node);
        if (head == null) {
            return newNode; // if list is empty
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;

    }
    public static Node insertAtASpecificPosition(Node head, int position,int new_Node){
        Node newNode = new Node(new_Node);

        // Insert at the beginning (position 0)
        if (position == 0 || head == null) {
            newNode.next = head;
            return newNode;
        }

        Node currentNode = head;
        int currentPosition = 0;

        // Traverse to the node just before the desired position
        while (currentNode != null && currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        // If position is out of bounds (greater than length of list), do nothing
        if (currentNode == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        // Insert the new node
        newNode.next = currentNode.next;
        currentNode.next = newNode;

        return head;
    }
    // Function to print the contents of the linked list
    public static void printList(Node head) {
        // Start from the head of the list
        Node curr = head;

        // Traverse the list
        while (curr != null) {
            // Print the current node's data
            System.out.print(" " + curr.data);

            // Move to the next node
            curr = curr.next;
        }

        // Print a newline at the end
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        System.out.println("Original Linked List:");
        printList(head);

        // Insert a new node at the front of the list
        System.out.println("After inserting Nodes at the front:");
        int data =40;
        head = insertionAtBeginning(head,data);
        printList(head);
        int data1 =50;
        System.out.println("After inserting Nodes at the End:");
        head = insertionAtEnd(head,data1);

        // Print the updated list
        printList(head);
        int data2 =60;
        int position= 2;
        System.out.println("After inserting Nodes IN middle:");
        head = insertAtASpecificPosition(head,position,data2);

        printList(head);
    }
}
