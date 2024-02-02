public class SwimmingAnimal implements Swimable, Goable {
    @Override
    public double swim() {
        System.out.println("Животное плавает");
        return 5.0;
    }

    @Override
    public double run() {
        System.out.println("Животное бегает");
        return 10.0;
    }
}
