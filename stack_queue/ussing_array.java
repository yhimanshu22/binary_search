import java.util.*;

class Node {
    int data; // Data of the node
    Node next; // Pointer to the next node

    Node(int data) {
        this.data = data; // Initialize node data
        this.next = null; // Next is initially null
    }
}

public class ussing_array {
    private Node top;

    public ussing_array() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

    }

    public int pop() {
        if (top != null) {
            int val = top.data;
            top = top.next;
            return val;
        } else {
            return -1;
        }
    }

    public int peek() {
        if (top != null) {
            return top.data;
        } else
            return -1;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        ussing_array myStack = new ussing_array(); // Create a new stack

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
