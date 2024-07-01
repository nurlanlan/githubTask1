package az.edu.turing.Module1.Lesson06;

public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    public MyLinkedList(Node<E> head) {
        this.size++;
        this.head = head;
    }

    public void addTail(Node<E> tail) {
        if (head == null) {
            head = tail;
        } else {
            Node<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(tail);
        }
        size++;
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                return (int) current.getData();
            }
            currentIndex++;
            current = current.getNext();
        }

        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int delete(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            int deletedData = head.data;
            head = ((Node<E>) head).next;
            return deletedData;
        }

        Node current = head;
        Node previous = null;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                previous.next = current.next;
                return current.data;
            }
            currentIndex++;
            previous = current;
            current = current.next;
        }

        @Override
        public String toString ( {
            StringBuilder sb = new StringBuilder();
            Node<E> curr = head;
            while (curr != null) {
                sb.append(curr.toString());
                curr = curr.getNext();
            }
            sb.append("null");
            return sb.toString();

        }
    }
