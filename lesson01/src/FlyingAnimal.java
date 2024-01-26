public class FlyingAnimal extends Animal {
    @Override
    public void fly() {
        System.out.println("Животное летит");
    }

    // Дополнительно переопределяем метод swim
    @Override
    public void swim() {
        System.out.println("Животное не умеет плавать");
    }
}
