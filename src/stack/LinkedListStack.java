package stack;
public class LinkedListStack {

    private Node head;

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    boolean isEmpty(){
        return  head == null;
    }
    void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            System.out.println("\nStack Overflow");
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // or throw an exception
        }
        int popped = head.data;
        head = head.next;
        return popped;
    }

    int peek() {

        // If stack is not empty, return the top element
        if (!isEmpty())
            return head.data;
        else {
            System.out.println("\nStack is empty");
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
