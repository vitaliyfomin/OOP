package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;

import java.util.Scanner;

public class UserView {
    private final UserController userController;
    private final Scanner scanner;

    public UserView(UserController userController) {
        this.userController = userController;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Доступные команды:");
            System.out.println("CREATE - создать пользователя");
            System.out.println("READ - прочитать информацию о пользователе");
            System.out.println("LIST - вывести список всех пользователей");
            System.out.println("UPDATE - обновить информацию о пользователе");
            System.out.println("DELETE - удалить пользователя");
            System.out.println("EXIT - выйти из приложения");
            String command = prompt("Введите команду: ").toUpperCase();
            switch (command) {
                case "CREATE":
                    createUser();
                    break;
                case "READ":
                    readUser();
                    break;
                case "LIST":
                    listUsers();
                    break;
                case "UPDATE":
                    updateUser();
                    break;
                case "DELETE":
                    deleteUser();
                    break;
                case "EXIT":
                    return;
                default:
                    System.out.println("Некорректная команда. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private void createUser() {
        String firstName = prompt("Введите имя: ");
        String lastName = prompt("Введите фамилию: ");
        String phone = prompt("Введите номер телефона: ");
        User user = userController.createUser(firstName, lastName, phone);
        userController.saveUser(user);
        System.out.println("Пользователь успешно создан.");
    }

    private void readUser() {
        long id;
        try {
            id = Long.parseLong(prompt("Введите идентификатор пользователя: "));
            User user = userController.readUser(id);
            if (user != null) {
                System.out.println("Информация о пользователе:");
                System.out.println(user);
            } else {
                System.out.println("Пользователь с указанным идентификатором не найден.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат идентификатора пользователя.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка при чтении пользователя: " + e.getMessage());
        }
    }

    private void listUsers() {
        System.out.println("Список всех пользователей:");
        userController.readAll().forEach(user -> System.out.printf("Имя: %s, Фамилия: %s, Телефон: %s%n",
                user.getFirstName(), user.getLastName(), user.getPhone()));
    }

    private void updateUser() {
        Long id;
        try {
            id = Long.parseLong(prompt("Введите идентификатор пользователя для обновления: "));
            User existingUser = userController.readUser(id);
            if (existingUser != null) {
                System.out.println("Текущая информация о пользователе:");
                System.out.println(existingUser);

                User update = new User(existingUser.getId(), existingUser.getFirstName(), existingUser.getLastName(), existingUser.getPhone());

                String fieldToUpdate = promptUpdateField();
                switch (fieldToUpdate) {
                    case "1":
                        update.setFirstName(prompt("Введите новое имя: "));
                        break;
                    case "2":
                        update.setLastName(prompt("Введите новую фамилию: "));
                        break;
                    case "3":
                        update.setPhone(prompt("Введите новый номер телефона: "));
                        break;
                    default:
                        System.out.println("Некорректный выбор.");
                        return;
                }
                userController.updateUser(String.valueOf(id), update);
                System.out.println("Информация о пользователе успешно обновлена.");
            } else {
                System.out.println("Пользователь с указанным идентификатором не найден.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат идентификатора пользователя.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка при обновлении пользователя: " + e.getMessage());
        }
    }

    private void deleteUser() {
        long id;
        try {
            id = Long.parseLong(prompt("Введите идентификатор пользователя для удаления: "));
            if (userController.deleteUser(id)) {
                System.out.println("Пользователь успешно удален.");
            } else {
                System.out.println("Пользователь с указанным идентификатором не найден.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат идентификатора пользователя.");
        }
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private String promptUpdateField() {
        System.out.println("Какое поле вы хотите обновить?");
        System.out.println("1. Имя");
        System.out.println("2. Фамилия");
        System.out.println("3. Номер телефона");
        return prompt("Введите номер поля: ");
    }
}
