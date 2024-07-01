package az.edu.turing.Module1.Lesson06;

public class MyLinkedListApp {

    public static void main(String[] args) {
        final Node<Integer> head = new Node<>(10);
        var myLinkedList = new MyLinkedList<>(head);
        System.out.println(myLinkedList);
        Node<Integer> second = new Node<>(20);
        myLinkedList.addTail(second);
        System.out.println(myLinkedList);
    }
}
