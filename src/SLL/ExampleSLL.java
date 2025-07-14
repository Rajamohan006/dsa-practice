package SLL;

import java.util.ArrayList;
import java.util.List;

public class ExampleSLL {
    static int countNodes(Node head) {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    // Function to convert linked list to List
    static void linkedListToList(Node head, List<Integer> list) {
        Node curr = head;

        for (int i = 0; i < list.size(); ++i) {
            list.set(i, curr.data);
            curr = curr.next;
        }
    }

    // Function to convert List back to linked list
    static void listToLinkedList(List<Integer> list, Node head) {
        Node curr = head;

        for (int i = 0; i < list.size(); ++i) {
            curr.data = list.get(i);
            curr = curr.next;
        }
    }

    // Function to modify the List according to the logic provided
    static void modifyList(List<Integer> list) {

        // Modify the List
        for (int i = 0; i < list.size() / 2; ++i) {
            int x = list.get(i); //step 1= 10
            list.set(i, list.get(list.size() - i - 1) - x); //step -  -7
            list.set(list.size() - i - 1, x);
        }
    }

    // Function to modify the linked list
    static Node modifyTheList(Node head) {
        if (head.next == null) return null;

        // Count the number of nodes
        int n = countNodes(head);

        // Create a List for the linked list data
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        // Convert linked list to List
        linkedListToList(head, list);
        System.out.print(list + " ");

        // Modify the List
        modifyList(list);

        // Convert List back to linked list
        listToLinkedList(list, head);

        return head;
    }

    // Function to print the linked list
    static void printList(Node node) {
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list
        // 10 -> 4 -> 5 -> 3 -> 6
        Node head = new Node(10);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(6);

        head = modifyTheList(head);

        printList(head);
    }
}
