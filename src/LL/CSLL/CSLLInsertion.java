package LL.CSLL;

public class CSLLInsertion {
    public static Node deleteLastNode(Node last){
        if (last == null) {
            return null;
        }
        Node head = last.next;

        // If there is only one node in the list
        if (head == last) {
            last = null;
            return last;
        }
        // Traverse the list to find the second last node
        Node curr = head;
        while (curr.next != last) {
            curr = curr.next;
        }
        // Update the second last node's next pointer to
        // point to head
        curr.next = head;
        last = curr;

        return last;
    }

    public static Node deleteFirstNode(Node last) {
        if(last == null) return  null;
        if (last.next == null)return null;
        last.next = last.next.next;
    return last;
    }
    static Node insertAtBeginning(Node last, Node newNOde){
        if (last == null) return  newNOde;
        newNOde.next = last.next;
        last.next= newNOde;
        return newNOde;
    }
    static Node insertAtEnd(Node last, Node newNode){
        if (last == null) {
            newNode.next = newNode; // circular link to self
            return newNode;         // newNode is now the only node
        }
        newNode.next = last.next; // new node points to head
        last.next = newNode;      // old last points to new node
        last = newNode;           // new node becomes last

        return last;

    }
    static Node insertAtMid(Node last, Node newNode,int position){
        if (last ==null){
            newNode.next = newNode;
            return newNode;
        }
        int size= 0;
        Node curr = last;
        while (curr != newNode && size <position -1){
            size++;
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return last;
    }
    static void printList(Node last){
        Node curr = last.next;
        while (curr != null){
            System.out.print(curr.data+ " ");
            curr = curr.next;
            if (curr == last.next) break;
        }
        System.out.println("");
    }
    public static void main(String [] args){
        Node first = new Node(2);
        Node second = new Node(3);
        Node last = new Node(4);

        first.next = second;
        second.next = last;
        last.next = first;
        printList(last);
        Node newNode= new Node(5);
        insertAtBeginning(last,newNode);
        printList(last);
        Node newNode1= new Node(6);
        insertAtEnd(last,newNode1);
        printList(last);
        Node newNode2= new Node(7);
        insertAtMid(last,newNode2,3);
        printList(last);

        deleteFirstNode(last);
        printList(last);
        deleteLastNode(last);
        printList(last);

    }
}
