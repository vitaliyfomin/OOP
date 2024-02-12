package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            // Предоставление пользователю информацию о доступных командах.
            System.out.println("Доступные команды:");
            System.out.println("CREATE - создать пользователя");
            System.out.println("READ - прочитать информацию о пользователе");
            System.out.println("LIST - вывести список всех пользователей");
            System.out.println("UPDATE - обновить информацию о пользователе");
            System.out.println("DELETE - удалить пользователя");
            System.out.println("EXIT - выйти из приложения");
            String command = prompt("Введите команду: ").toUpperCase(); // Преобразование в верхний регистр
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректная команда. Пожалуйста, введите снова.");
                continue;
            }
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    User u = createUser();
                    userController.saveUser(u);
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    String userId = prompt("Введите id пользователя: ");
                    User updateUser = new User("", "", ""); // Создание объекта с пустыми данными
                    String fieldToUpdate = promptUpdateField();
                    switch (fieldToUpdate) {
                        case "1":
                            updateUser.setFirstName(prompt("Enter new first name: "));
                            break;
                        case "2":
                            updateUser.setLastName(prompt("Enter new last name: "));
                            break;
                        case "3":
                            updateUser.setPhone(prompt("Enter new phone number: "));
                            break;
                        default:
                            System.out.println("Некорректный выбор.");
                            break;
                    }
                    userController.updateUser(userId, updateUser);
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private String promptUpdateField() {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое поле вы хотите обновить?");
        System.out.println("1. Имя");
        System.out.println("2. Фамилия");
        System.out.println("3. Номер телефона");
        System.out.print("Введите номер поля: ");
        return in.nextLine();
    }

}
