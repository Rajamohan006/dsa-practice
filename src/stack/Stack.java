package stack;

import java.util.ArrayList;

/**
 * A Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.
 *
 * It behaves like a stack of plates, where the last plate added is the first one to be removed. Think of it this way:
 *
 * Pushing an element onto the stack is like adding a new plate on top.
 * Popping an element removes the top plate from the stack.
 *
 * Basic Operations on Stack:
 * In order to make manipulations in a stack, there are certain operations provided to us.
 *
 * push() to insert an element into the stack
 * pop() to remove an element from the stack
 * top() Returns the top element of the stack.
 * isEmpty() returns true if stack is empty else false.
 * isFull() returns true if the stack is full else false.
 */
public class Stack {
    int top, cap;
    int[] a;
    public Stack(int cap){
        this.cap= cap;
        top= -1;
        a = new int[cap];
    }
    public boolean push(int x){
        if(top >=cap -1){
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }
    public int pop(){
        if(top <0){
            System.out.println("Stack underflow");
            return 0;
        }
        return  a[top--];
    }
    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }
    public static void main(String [] args){
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " popped from stack");

        System.out.println("Top element is: " + s.peek());

        System.out.print("Elements present in stack: ");
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        // Using the Dynamic Array
        ArrayList<Integer> s1 = new ArrayList<>();
        // Push elements
        s1.add(10);
        s1.add(20);
        s1.add(30);
        // Pop and print the top element
        System.out.println(s1.get(s1.size() - 1) + " popped from stack");
        s1.remove(s1.size() - 1);


        // Peek at the top element
        System.out.println("Top element is: " + s1.get(s1.size() - 1));
        // Print all elements in the stack
        System.out.print("Elements present in stack: ");
        while (!s.isEmpty()) {
            System.out.print(s1.get(s1.size() - 1) + " ");
            s1.remove(s1.size() - 1);
        }

    }
}
