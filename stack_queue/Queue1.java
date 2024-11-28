package stack_queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue1 {
    Node front;
    Node rear;

    public Queue1() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;

    }

    public int dequeue() {
        if (front == null) {
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return val;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue1 myQueue = new Queue1(); // Create a new queue

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println("Front element is: " + myQueue.peek()); // Should print 10

        System.out.println("Dequeued element: " + myQueue.dequeue()); // Should print 10
        System.out.println("Front element after dequeue: " + myQueue.peek()); // Should print 20

        System.out.println("Is queue empty? " + myQueue.isEmpty()); // Should print false

        myQueue.dequeue(); // Remove 20
        myQueue.dequeue(); // Remove 30
        System.out.println("Is queue empty after dequeuing all elements? " + myQueue.isEmpty()); // Should print true
    }
}
