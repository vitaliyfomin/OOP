// однонаправленный список

public class Main {
    public static void main(String[] args) {
        LinkedList.LinkedList list = new LinkedList.LinkedList(); // Используем полное имя класса
        list.insertFirst(5);
        list.insertLast(10);
        System.out.println("Размер списка: " + list.getSize()); // Выводим размер списка
        System.out.println("Значение по индексу 1: " + list.getNodeValue(1)); // Выводим значение элемента по индексу 1
    }
}
