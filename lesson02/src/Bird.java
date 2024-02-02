public class Bird implements Flyable, Goable {
    @Override
    public double fly() {
        System.out.println("Птица летит");
        return 20.0;
    }

    @Override
    public double run() {
        System.out.println("Птица бегает");
        return 15.0;
    }
}