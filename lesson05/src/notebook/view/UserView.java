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
        // Код обработки пользовательского ввода
    }

    private String prompt(String message) {
        // Метод для запроса ввода от пользователя
    }

    private User createUser() {
        // Логика создания нового пользователя
    }
}
