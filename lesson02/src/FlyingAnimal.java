public class FlyingAnimal implements Flyable, Goable {
    @Override
    public double fly() {
        // Логика для получения скорости полета
        return 20.0;
    }

    @Override
    public double run() {
        // Логика для получения скорости бега
        return 15.0;
    }
}