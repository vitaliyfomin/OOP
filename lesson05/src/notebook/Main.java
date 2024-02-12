package notebook;

import notebook.controller.UserController;
import notebook.model.repository.impl.UserRepository;
import notebook.view.UserView;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = loadDataFromDatabase(); // Загрузка данных из базы данных
        UserRepository repository = new UserRepository(data);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }

    private static List<String> loadDataFromDatabase() {
        // Логика загрузки данных из базы данных
    }
}
