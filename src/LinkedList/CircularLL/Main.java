package LinkedList.CircularLL;

public class Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();
        list.delete(4);
        list.display();
    }
}
