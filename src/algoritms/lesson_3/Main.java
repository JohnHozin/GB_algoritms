package algoritms.lesson_3;

public class Main {
    public static void main(String[] args) {
        LinkedListDouble list = new LinkedListDouble();
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(9);
        list.addLast(1);
        list.addLast(4);
        list.printList();

        list.bubbleSort();
        list.printList();

//        list.deleteFirst();
//        list.printList();
//        list.deleteLast();
//        list.printList();

//        list.revert();
//        list.printList();

        list.revert();
        list.printList();
    }


}
