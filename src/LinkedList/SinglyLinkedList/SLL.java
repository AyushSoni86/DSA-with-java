package LinkedList.SinglyLinkedList;

public class SLL {

    int size;
    private Node head;
    private Node tail;
    SLL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    public void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) tail = head;
        size++;
    }

    public void insertAtLast(int data) {
        if (tail == null) {
            insertAtFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if (index == size) {
            insertAtLast(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) return deleteFirst();
        int val = tail.data;
        Node secondLast = get(size - 1);
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index) {
        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteLast();

        Node secondLast = get(index);
        int val = secondLast.next.data;
        secondLast.next = secondLast.next.next;
        return val;
    }

    public Node find(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


}
