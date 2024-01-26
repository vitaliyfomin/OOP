public class SwimmingAnimal extends Animal {
    @Override
    public void swim() {
        System.out.println("Животное плывет");
    }

    // Дополнительно переопределяем метод fly
    @Override
    public void fly() {
        System.out.println("Животное не может летать");
    }
}
