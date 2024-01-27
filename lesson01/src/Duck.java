public class Duck extends Animal {
    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }
}
