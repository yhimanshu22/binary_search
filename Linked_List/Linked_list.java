package Linked_List;

public class Linked_list {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public void deleteAtPosition(int position) {
        if (head == null)
            return;
        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return; // position does not exist
        }

        temp.next = temp.next.next;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public Node getNthFromEnd(int n) {
        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        temp = head;

        for (int i = 0; i < cnt - n; i++) {
            if (temp == null) return null;
            temp = temp.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Linked_list linkedList = new Linked_list();

        // Inserting elements
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);

        // Display the list
        System.out.println("Linked List after insertions:");
        linkedList.display();

        // Size of the list
        System.out.println("Size of the list: " + linkedList.size());

        // Searching for an element
        int searchKey = 20;
        System.out
                .println("Searching for " + searchKey + ": " + (linkedList.search(searchKey) ? "Found" : "Not Found"));

        // Deleting elements
        linkedList.deleteAtBeginning();
        System.out.println("Linked List after deleting at beginning:");
        linkedList.display();

        linkedList.deleteAtLast();
        System.out.println("Linked List after deleting at last:");
        linkedList.display();

        // Deleting at a specific position
        linkedList.deleteAtPosition(1); // Deletes the node at position 1
        System.out.println("Linked List after deleting at position 1:");
        linkedList.display();

        // Reversing the linked list
        linkedList.reverse();
        System.out.println("Linked List after reversing:");
        linkedList.display();

        // Getting the nth node from the end
        int n = 2;
        Linked_list.Node nthNode = linkedList.getNthFromEnd(n);
        if (nthNode != null) {
            System.out.println("Node at position " + n + " from the end: " + nthNode.data);
        }

        // Final size of the list
        System.out.println("Final size of the list: " + linkedList.size());
    }
}
