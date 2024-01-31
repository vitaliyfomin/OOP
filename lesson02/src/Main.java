public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        FlyingAnimal bird = new FlyingAnimal();
        SwimmingAnimal fish = new SwimmingAnimal();

        // Проверяем полиморфизм
        genericAnimal.toGo();
        genericAnimal.fly();
        genericAnimal.swim();

        bird.toGo();
        bird.fly();
        bird.swim();

        fish.toGo();
        fish.fly();
        fish.swim();
    }
}