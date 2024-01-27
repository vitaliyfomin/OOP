public abstract class DivingAnimal extends Animal {
    @Override
    public void dive() {
        System.out.println("Животное ныряет");
    }

    @Override
    public void fly() {
        System.out.println("Ныряющие животные не умеют летать");
    }
}
