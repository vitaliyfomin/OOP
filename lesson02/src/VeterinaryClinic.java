import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Goable> runningAnimals;
    private List<Flyable> flyingAnimals;
    private List<Swimable> swimmingAnimals;
    private List<Doctor> doctors;
    private List<Nurse> nurses;

    public VeterinaryClinic() {
        runningAnimals = new ArrayList<>();
        flyingAnimals = new ArrayList<>();
        swimmingAnimals = new ArrayList<>();
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
    }

    public void addRunningAnimal(Goable animal) {
        runningAnimals.add(animal);
    }

    public void addFlyingAnimal(Flyable animal) {
        flyingAnimals.add(animal);
    }

    public void addSwimmingAnimal(Swimable animal) {
        swimmingAnimals.add(animal);
    }

    public void hireDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void hireNurse(Nurse nurse) {
        nurses.add(nurse);
    }

}
