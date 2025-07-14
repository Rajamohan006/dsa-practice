package DLL;

public class DLLTraverse {
    static void forwardTraversal(Node head) {
        Node curr = head;

        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the next node
            curr = curr.next;
        }

        System.out.println();
    }
    public static void backwardTraversal(Node tail) {

        // Start traversal from the tail of the list
        Node curr = tail;

        // Continue until current node is not null
        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the previous node
            curr = curr.prev;
        }
    }
    static int findSize(Node head){
        int size = 0;
        Node curr = head;
        while (curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }
    public static void main(String[] args) {

        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Forward Traversal: ");
        forwardTraversal(head);
        backwardTraversal(third);
        int size = findSize(head);
        System.out.println("Size: "+ size);

    }
}
