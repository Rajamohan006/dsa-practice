package SLL;

/**
 * Searching in Singly Linked List
 * Searching in a Singly Linked List refers to the process of looking for a specific element or value within the elements of the linked list.
 * <p>
 * Step-by-step approach:
 * <p>
 * Start from the head of the linked list.
 * Check each node’s data:
 * If it matches the target value, return true (element found).
 * Otherwise, move to the next node.
 * Repeat until the end (NULL) is reached.
 * If no match is found, return false.
 */
public class SSLSearching {
    static boolean searchKey(Node head, Integer key) {
        Node current = head;
       /* while(current != null){
            if(current.data == key){
               // System.out.println(current.data);
                return true;
            }
            current = current.next;
        }
        return false;*/
        if (current == null) return false;
        if (current.data == key) {
            System.out.println(current.data);
            return true;
        }

        return searchKey(current.next, key);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(13);
        System.out.println(searchKey(head, 11) ? "Yes" : "No");
    }
}
