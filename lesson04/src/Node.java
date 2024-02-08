// Класс Node предоставляет методы для доступа
// к данным и управления ссылками на предыдущий и следующий узлы.
class Node<E> {
    private final E data;
    private Node<E> prev;
    private Node<E> next;

    public Node(E data, Node<E> prev, Node<E> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
