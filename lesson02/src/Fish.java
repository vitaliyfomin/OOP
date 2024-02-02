public class Fish implements Swimable, Goable {
    @Override
    public double swim() {
        System.out.println("Рыба плавает");
        return 8.0;
    }

    @Override
    public double run() {
        System.out.println("Рыба бегает");
        return 5.0;
    }
}