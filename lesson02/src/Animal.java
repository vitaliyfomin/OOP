public class Animal implements Goable, Flyable, Swimable {
    @Override
    public double run() {
        System.out.println("Животное движется");
        // Возвращаем фиксированную скорость для примера
        return 5.0;
    }

    @Override
    public double fly() {
        System.out.println("Животное не может летать");
        // Возвращаем фиксированную скорость для примера
        return 0.0;
    }

    @Override
    public double swim() {
        System.out.println("Животное не умеет плавать");
        // Возвращаем фиксированную скорость для примера
        return 0.0;
    }
}