class FlyingAnimal2 implements Flyable, Goable {
    @Override
    public double fly() {
        return 25.0;
    }

    @Override
    public double run() {
        return 15.0;
    }
}