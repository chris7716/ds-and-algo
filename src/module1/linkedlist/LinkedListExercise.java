package module1.linkedlist;

public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(20);
        linkedList.addLast(40);
        linkedList.addFirst(10);
        linkedList.deleteFirst();
        linkedList.deleteLast();

        System.out.println(linkedList.indexOf(40));
        System.out.println(linkedList.indexOf(20));
        System.out.println(linkedList.indexOf(10));
    }
}
