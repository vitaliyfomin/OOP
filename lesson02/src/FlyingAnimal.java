public class FlyingAnimal implements Flyable, Goable {
    @Override
    public double fly() {
        System.out.println("Животное летит");
        return 20.0;
    }

    @Override
    public double run() {
        System.out.println("Животное бегает");
        return 15.0;
    }
}
