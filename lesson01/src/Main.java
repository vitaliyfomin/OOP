public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        FlyingAnimal bird = new FlyingAnimal();
        SwimmingAnimal fish = new SwimmingAnimal();
        RunningAnimal cheetah = new RunningAnimal();
        DivingAnimal penguin = new DivingAnimal();
        Duck duck = new Duck();
        Penguin penguinInstance = new Penguin();

        genericAnimal.toGo();
        genericAnimal.fly();
        genericAnimal.swim();
        genericAnimal.run();
        genericAnimal.quack();
        genericAnimal.dive();

        bird.toGo();
        bird.fly();
        bird.swim();
        bird.run();
        bird.quack();
        bird.dive();

        fish.toGo();
        fish.fly();
        fish.swim();
        fish.run();
        fish.quack();
        fish.dive();

        cheetah.toGo();
        cheetah.fly();
        cheetah.swim();
        cheetah.run();
        cheetah.quack();
        cheetah.dive();

        penguin.toGo();
        penguin.fly();
        penguin.swim();
        penguin.run();
        penguin.quack();
        penguin.dive();

        duck.toGo();
        duck.fly();
        duck.swim();
        duck.run();
        duck.quack();
        duck.dive();

        penguinInstance.toGo();
        penguinInstance.fly();
        penguinInstance.swim();
        penguinInstance.run();
        penguinInstance.quack();
        penguinInstance.dive();
    }
}
