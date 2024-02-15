package homework.user;

public class User {
    private final String name;
    private final UserSaver userSaver;

    public User(String name, UserSaver userSaver) {
        this.name = name;
        this.userSaver = userSaver;
    }

    public String getName() {
        return name;
    }

    public void save() {
        userSaver.saveUser(this);
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }
}
