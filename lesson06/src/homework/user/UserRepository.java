package homework.user;

public class UserRepository implements UserSaver {
    @Override
    public void saveUser(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
