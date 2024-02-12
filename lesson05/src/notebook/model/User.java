package notebook.model;

import java.util.Objects;

public class User {
    // остальные поля и методы

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phone);
    }

    @Override
    public boolean equals(Object obj) {
        // реализация метода equals
    }
}
