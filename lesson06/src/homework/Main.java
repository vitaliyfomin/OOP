package homework;

import homework.report.impl.Report;
import homework.save.impl.Persister;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        // Создаем экземпляр Persister для сохранения пользователя
        Persister persister = new Persister();
        persister.save(user);

        // Вывод списка сохраненных пользователей
        System.out.println("List of saved users:");
        for (User savedUser : persister.getUsers()) {
            System.out.println(savedUser.getName());
        }

        // Создаем экземпляр Report для создания отчета
        Report reportGenerator = new Report();
        String report = reportGenerator.generateReport(user);
        System.out.println(report);
    }
}
