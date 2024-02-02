public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Добавление животных в клинику
        clinic.addRunningAnimal(new RunningAnimal());
        clinic.addFlyingAnimal(new Bird());
        clinic.addSwimmingAnimal(new Fish());

        // Найм персонала
        Doctor vet1 = new Doctor("Доктор Смит", 10);
        Doctor vet2 = new Doctor("Доктор Маруся", 8);
        Nurse nurse1 = new Nurse("Медсестра Люся", true);
        Nurse nurse2 = new Nurse("Медсестра Марина" +
                "" +
                "" +
                "", false);

        clinic.hireDoctor(vet1);
        clinic.hireDoctor(vet2);
        clinic.hireNurse(nurse1);
        clinic.hireNurse(nurse2);

    }
}