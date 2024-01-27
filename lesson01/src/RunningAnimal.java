public class RunningAnimal extends Animal {
    @Override
    public void run() {
        System.out.println("Животное бегает");
    }

    @Override
    public void dive() {
        System.out.println("Бегающие животные не могут нырять");
    }
}
