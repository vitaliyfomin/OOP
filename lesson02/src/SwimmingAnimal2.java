class SwimmingAnimal2 implements Swimable, Goable {
    @Override
    public double swim() {
        return 8.0;
    }

    @Override
    public double run() {
        return 12.0;
    }
}