public class FlyingAnimal extends Animal {
    @Override
    public void fly() {
        System.out.println("Животное летает");
    }

    @Override
    public void dive() {
        System.out.println("Летающие животные не умеют нырять");
    }
}
