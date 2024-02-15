package homework;

import homework.user.User;
import homework.user.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = new User("Bob", userRepository);
        user.report();
        user.save();
    }
}
