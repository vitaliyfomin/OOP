
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        FlyingAnimal1 bird1 = new FlyingAnimal1();
        FlyingAnimal2 bird2 = new FlyingAnimal2();
        SwimmingAnimal1 fish1 = new SwimmingAnimal1();
        SwimmingAnimal2 fish2 = new SwimmingAnimal2();

        // Проверяем полиморфизм
        genericAnimal.run();
        genericAnimal.fly();
        genericAnimal.swim();

        bird1.run();
        bird1.fly();
        bird1.swim();

        bird2.run();
        bird2.fly();
        bird2.swim();

        fish1.run();
        fish1.fly();
        fish1.swim();

        fish2.run();
        fish2.fly();
        fish2.swim();
    }
}