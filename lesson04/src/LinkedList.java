public class LinkedList<E> {
    private final Node<E> firstNode;
    private final Node<E> lastNode;
    private int size;

    public LinkedList() {
        firstNode = new Node<>(null, null, null);
        lastNode = new Node<>(null, firstNode, null);
        firstNode.setNext(lastNode);
    }

    public void insertFirst(E value) {
        if (value == null) {
            throw new IllegalArgumentException("Значение не может быть нулевым");
        }
        Node<E> newNode = new Node<>(value, firstNode, firstNode.getNext());
        firstNode.getNext().setPrev(newNode);
        firstNode.setNext(newNode);
        size++;
    }

    public void insertLast(E value) {
        if (value == null) {
            throw new IllegalArgumentException("Значение не может быть нулевым");
        }
        Node<E> newNode = new Node<>(value, lastNode.getPrev(), lastNode);
        lastNode.getPrev().setNext(newNode);
        lastNode.setPrev(newNode);
        size++;
    }

    public int getSize() {
        return size;
    }

    public E getNodeValue(int index) {
        if (index < 0 || index >= size) {
            return null; // возвращаем null, если индекс недопустим
        }
        Node<E> current = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
}
