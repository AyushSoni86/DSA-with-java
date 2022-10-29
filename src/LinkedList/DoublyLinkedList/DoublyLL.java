package LinkedList.DoublyLinkedList;

public class DoublyLL {

    private Node head;

    class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int data) {

        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;
        head = node;

    }

    public void insertAtLast(int data) {
        Node node = new Node(data);
        Node temp = head;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insertAtElement(int data, int target) {
        Node pos = targetNode(target);
//        Node q = pos.next;
        Node node = new Node(data, pos.next);
        pos.next = node;
        node.prev = pos;
        if (node.next.prev != null)
            node.next.prev = node;
    }

    public Node targetNode(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                temp = temp.next;
            }
        }
        return null;
    }

    public void display() {
        System.out.println();
        Node node = head;
        Node last = null;
        System.out.print("null");
        while (node != null) {
            System.out.print(" <- " + node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("null");

        System.out.println("Printing in reverse direction");
        System.out.print("null");
        while (last != null) {
            System.out.print(" <- " + last.data + " -> ");
            last = last.prev;
        }
        System.out.println("null");
    }



}