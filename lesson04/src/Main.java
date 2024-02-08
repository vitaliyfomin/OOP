// двунаправленный список
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertFirst(5);
        list.insertLast(10);
        list.insertLast(15);
        list.insertLast(20);
        list.insertLast(25);

        System.out.println("Размер списка: " + list.getSize());

        // Вывод значений по индексам в обычном порядке
        for (int i = 1; i <= list.getSize(); i++) {
            System.out.println("Значение по индексу " + i + ": " + list.getNodeValue(i));
        }
        System.out.println("---------------------");
        // Вывод значений по индексам в зеркальном порядке
        for (int i = list.getSize(); i > 0; i--) {
            System.out.println("Значение по индексу " + i + ": " + list.getNodeValue(i));
        }
    }
}
