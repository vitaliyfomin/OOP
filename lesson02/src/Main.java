import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Добавление животных в клинику
        clinic.addRunningAnimal(new RunningAnimal());
        clinic.addFlyingAnimal(new Bird()); // Используем класс Bird
        clinic.addSwimmingAnimal(new Fish()); // Используем класс Fish

        // Найм персонала
        Doctor vet1 = new Doctor("Доктор Смит", 10);
        Doctor vet2 = new Doctor("Доктор Маруся", 8);
        Nurse nurse1 = new Nurse("Медсестра Люся", true);
        Nurse nurse2 = new Nurse("Медсестра Марина", false);

        clinic.hireDoctor(vet1);
        clinic.hireDoctor(vet2);
        clinic.hireNurse(nurse1);
        clinic.hireNurse(nurse2);

        // Получение всех бегающих, летающих и плавающих животных из клиники
        List<Goable> runningAnimals = clinic.getAllRunningAnimals();
        List<Flyable> flyingAnimals = clinic.getAllFlyingAnimals();
        List<Swimable> swimmingAnimals = clinic.getAllSwimmingAnimals();

        // Использование списков
        for (Goable animal : runningAnimals) {
            System.out.println("Скорость бегающего: " + animal.run());
        }

        for (Flyable animal : flyingAnimals) {
            System.out.println("Скорость летающего: " + animal.fly());
        }

        for (Swimable animal : swimmingAnimals) {
            System.out.println("Скорость плавающего: " + animal.swim());
        }

        // Дополнительные действия с клиникой
        // ...
    }
}
