package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();

        // insertion at first index
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);

        // insertion at last index
        list.insertAtLast(111);
        list.insertAtLast(1111);
        list.insertAtLast(11111);

        // printing our linked list
        list.display();
//        list.insertAtIndex(5, 3);
//        list.display();

//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteFirst());
//
        System.out.println(list.deleteAtIndex(8));
    //    System.out.println(list.deleteAtIndex(3));
     //   System.out.println(list.deleteAtIndex(1));
        list.display();
//        System.out.println(list.size);
    }
}
