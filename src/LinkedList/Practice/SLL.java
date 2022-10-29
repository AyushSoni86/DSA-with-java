package LinkedList.Practice;

public class SLL {
    Node head;
    Node tail;

    SLL() {
        this.head = null;
        this.tail = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int data) {
        if (tail == null){
            tail = head;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
    }


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
