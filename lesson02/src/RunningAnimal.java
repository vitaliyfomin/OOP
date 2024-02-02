public class RunningAnimal implements Goable {
    @Override
    public double run() {
        System.out.println("Животное бегает");
        return 10.0;
    }
}