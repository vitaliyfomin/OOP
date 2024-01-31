class SwimmingAnimal1 implements Swimable, Goable {
    @Override
    public double swim() {
        return 5.0;
    }

    @Override
    public double run() {
        return 10.0;
    }
}
