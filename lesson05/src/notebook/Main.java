package notebook;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.model.repository.impl.UserRepository;
import notebook.util.DBConnector;
import notebook.view.UserView;

public class Main {
    public static void main(String[] args) {
        DBConnector.createDB();
        UserRepository userRepository = new UserRepository();
        UserController userController = new UserController(userRepository);
        UserView userView = new UserView(userController);
        userView.run();

        // Добавляем завершающий блок для сохранения данных перед выходом
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            userRepository.writeToFile();
        }));
    }
}
