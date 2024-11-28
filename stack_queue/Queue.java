package stack_queue;

public class Queue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int val) {
        if (size == capacity) {
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

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
