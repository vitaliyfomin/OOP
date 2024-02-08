package LinkedList;
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public int getNodeValue(int index) {
        if (index < 0 || index >= size) {
            return -1; // возвращаем -1, если индекс недопустим
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
}