package notebook.controller;

import notebook.model.User;
import notebook.model.repository.GBRepository;

import java.util.List;

public class UserController {
    private final GBRepository repository;

    public UserController(GBRepository repository) {
        this.repository = repository;
    }

    // остальные методы

    public boolean deleteUser(Long userId) {
        return repository.delete(userId);
    }
}
