public class SwimmingAnimal extends Animal {
    @Override
    public void swim() {
        System.out.println("Животное плавает");
    }

    @Override
    public void run() {
        System.out.println("Плавающие животные не могут бегать");
    }
}
