package notebook.model.repository.impl;

import notebook.model.User;
import notebook.model.repository.GBRepository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository implements GBRepository {
    private final List<User> users = new ArrayList<>();
    public static final String DB_PATH = "db.txt";

    public UserRepository() {
        readFromFile(); // Добавим чтение данных из файла при создании репозитория
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void create(User user) {
        long max = users.stream().mapToLong(User::getId).max().orElse(0);
        user.setId(max + 1);
        users.add(user);
        // Отложенная запись в файл
        writeToFile();
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> Objects.equals(user.getId(), id)).findFirst();
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
        // Отложенная запись в файл
        writeToFile();
        return existingUser;
    }

    @Override
    public boolean delete(Long id) {
        boolean removed = users.removeIf(user -> user.getId().equals(id));
        // Отложенная запись в файл
        writeToFile();
        return removed;
    }

    private void readFromFile() {
        // Добавим чтение данных из файла при запуске программы
        File dbFile = new File(DB_PATH);
        if (dbFile.exists()) {
            // Чтение данных из файла и добавление их в список пользователей
        }
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DB_PATH))) {
            for (User user : users) {
                writer.write(user.getId() + "," + user.getFirstName() + "," + user.getLastName() + "," + user.getPhone() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Failed to write to DB: " + e.getMessage());
        }
    }
}
