package notebook.controller;

import notebook.model.User;
import notebook.model.repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository repository;

    public UserController(GBRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public void updateUser(String userId, User update) { //  Обновления только выбранного поля
        List<User> users = repository.findAll();
        User editUser = users.stream()
                .filter(u -> u.getId().equals(Long.parseLong(userId)))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));

        if (update.getFirstName() != null) {
            editUser.setFirstName(update.getFirstName());
        }
        if (update.getLastName() != null) {
            editUser.setLastName(update.getLastName());
        }
        if (update.getPhone() != null) {
            editUser.setPhone(update.getPhone());
        }
        repository.update(Long.parseLong(userId), editUser);
    }

    // Реализация удаления пользователей
    public boolean deleteUser(Long userId) {
        return repository.delete(userId);
    }


    // Перенос метода createUser из UserView в UserController.
    // Этот метод работает с вводом данных пользователя и их валидацией,
    // что логично выполнять в слое контроллера.
    public User createUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");

        UserValidator validator = new UserValidator();

        return validator.validate(new User(firstName, lastName, phone));
    }


}
