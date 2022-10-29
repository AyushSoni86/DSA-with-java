package LinkedList.CircularLL;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }
    class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        System.out.println();
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    public void delete(int val){
        Node node = head;
        if (node == null) return;
        if (node.data == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.data == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

}
