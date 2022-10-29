package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

//        list.display();
        list.insertAtLast(23);
        list.insertAtLast(233);
        list.insertAtLast(2333);

        list.display();

        list.insertAtElement(46,5);
        list.display();
        list.insertAtElement(46,23);
        list.display();
        list.insertAtElement(46,1);
        list.display();
    }
}
