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

    // Вставка в начало списка
    public void insertFirst(int value) {
        insertNode(value, true);
    }

    // Вставка в конец списка
    public void insertLast(int value) {
        insertNode(value, false);
    }

    // Приватный метод для вставки узла
    private void insertNode(int value, boolean isFirst) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (isFirst) {
                newNode.next = head;
                head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
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

    private static class Node { // Добавляем static
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
