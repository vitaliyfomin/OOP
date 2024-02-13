package notebook.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnector {
    public static final String DB_PATH = "db.txt";

    public static void createDB() {
        File db = new File(DB_PATH);
        if (!db.exists()) {
            try {
                if (db.createNewFile()) {
                    System.out.println("База данных создана");
                }
            } catch (IOException e) {
                System.err.println("Не удалось создать базу данных: " + e.getMessage());
            }
        } else {
            System.out.println("База данных уже существует");
        }
    }
}
