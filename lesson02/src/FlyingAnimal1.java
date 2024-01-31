class FlyingAnimal1 implements Flyable, Goable {
    @Override
    public double fly() {
        return 20.0;
    }

    @Override
    public double run() {
        return 10.0;
    }
}