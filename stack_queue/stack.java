package stack_queue;

import java.util.*;

// Node class to represent each element in the linked list
class Node {
    int data; // Data of the node
    Node next; // Pointer to the next node

    Node(int data) {
        this.data = data; // Initialize node data
        this.next = null; // Next is initially null
    }
}

public class stack {

    private Node top; // Pointer to the top node of the stack

    // Constructor to initialize the stack
    public stack() {
        this.top = null; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value); // Create a new node
        newNode.next = top; // Point new node to the current top
        top = newNode; // Update top to the new node
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top != null) { // Check if stack is not empty
            int value = top.data; // Get the top value
            top = top.next; // Update top to the next node
            return value; // Return the popped value
        } else {
            System.out.println("Stack underflow");
            return -1; // Return an error value
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (top != null) {
            return top.data; // Return the top value
        } else {
            System.out.println("Stack is empty");
            return -1; // Return an error value
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // Return true if stack is empty
    }

    // Main function to test the stack
    public static void main(String[] args) {
        stack myStack = new stack(); // Create a new stack

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element is: " + myStack.peek()); // Should print 30

        System.out.println("Popped element: " + myStack.pop()); // Should print 30
        System.out.println("Top element after pop: " + myStack.peek()); // Should print 20

        System.out.println("Is stack empty? " + myStack.isEmpty()); // Should print false

        myStack.pop(); // Remove 20
        myStack.pop(); // Remove 10
        System.out.println("Is stack empty after popping all elements? " + myStack.isEmpty()); // Should print true
    }

}