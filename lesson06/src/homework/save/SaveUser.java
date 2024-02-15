package homework.save;

import java.util.List;

public interface SaveUser<T> {
    boolean save(T t);
    List<T> getUsers();
}
