public class Animal implements Goable, Flyable, Swimable {
    @Override
    public double run() {
        System.out.println("Животное бегает");
        return 5.0;
    }

    @Override
    public double fly() {
        System.out.println("Животное летит");
        return 0.0;
    }

    @Override
    public double swim() {
        System.out.println("Животное плавает");
        return 0.0;
    }
}