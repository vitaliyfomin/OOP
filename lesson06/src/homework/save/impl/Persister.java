package homework.save.impl;

import homework.User;
import homework.save.SaveUser;

import java.util.ArrayList;
import java.util.List;

public class Persister implements SaveUser<User> {
    private final List<User> userList;

    public Persister() {
        userList = new ArrayList<>();
    }

    @Override
    public boolean save(User user) {
        userList.add(user);
        System.out.println("User saved: " + user.getName());
        return true;
    }

    @Override
    public List<User> getUsers() {
        return userList;
    }
}
