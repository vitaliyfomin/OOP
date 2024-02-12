package notebook.model.repository.impl;

import notebook.model.User;
import notebook.model.repository.GBRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository {
    private final List<User> users = new ArrayList<>(); // Создаем список пользователей

    // Убираем конструктор, который требует файловую операцию
    // public UserRepository(FileOperation operation) {
    //     this.mapper = new UserMapper();
    //     this.operation = operation;
    // }

    // Добавляем пустой конструктор
    public UserRepository() {
        // Можно добавить инициализацию, если требуется
    }

    // Реализация методов интерфейса GBRepository

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public User create(User user) {
        long max = users.stream().mapToLong(User::getId).max().orElse(0);
        user.setId(max + 1);
        users.add(user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public Optional<User> update(Long userId, User update) {
        Optional<User> existingUser = findById(userId);
        existingUser.ifPresent(user -> {
            if (update.getFirstName() != null) {
                user.setFirstName(update.getFirstName());
            }
            if (update.getLastName() != null) {
                user.setLastName(update.getLastName());
            }
            if (update.getPhone() != null) {
                user.setPhone(update.getPhone());
            }
        });
        return existingUser;
    }

    @Override
    public boolean delete(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
