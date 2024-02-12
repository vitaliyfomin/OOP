package notebook.model.repository.impl;

import notebook.model.User;
import notebook.util.mapper.Mapper;
import notebook.util.mapper.impl.UserMapper;
import notebook.model.repository.GBRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository {
    private final Mapper mapper;
    private final List<String> data;

    public UserRepository(List<String> data) {
        this.mapper = new UserMapper();
        this.data = data;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (String line : data) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        long nextId = getNextId();
        user.setId(nextId);
        data.add(mapper.toInput(user));
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        for (String line : data) {
            User user = mapper.toOutput(line);
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long userId, User update) {
        for (int i = 0; i < data.size(); i++) {
            User user = mapper.toOutput(data.get(i));
            if (user.getId().equals(userId)) {
                data.set(i, mapper.toInput(update));
                return Optional.of(update);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        for (int i = 0; i < data.size(); i++) {
            User user = mapper.toOutput(data.get(i));
            if (user.getId().equals(id)) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    private long getNextId() {
        long maxId = 0;
        for (String line : data) {
            User user = mapper.toOutput(line);
            maxId = Math.max(maxId, user.getId());
        }
        return maxId + 1;
    }
}
