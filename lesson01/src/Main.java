import java.time.LocalDate;
import java.util.logging.Logger;

class Illness {
    private String title;

    private Illness(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "title='" + title + '\'' +
                '}';
    }

    public static Illness createIllness(String title) {
        return new Illness(title);
    }
}

class Owner {
    private String fullName;

    private Owner(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name cannot be null");
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    public static Owner createOwner(String fullName) {
        return new Owner(fullName);
    }
}

abstract class Animal {
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;
    protected double movementStatistics;

    protected static final Logger LOGGER = Logger.getLogger(Animal.class.getName());

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness, double movementStatistics) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
        this.movementStatistics = movementStatistics;
    }

    public abstract void toGo(double meters);

    public abstract void fly(double meters);

    public abstract void swim(double meters);

    @Override
    public String toString() {
        return String.format("nickName='%s', birthDate=%s, owner=%s, illness=%s, movementStatistics=%.2f",
                nickName, birthDate, owner, illness, movementStatistics);
    }
}

class Cat extends Animal {
    private double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, double discount, double movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
        this.discount = discount;
    }

    public Cat() {
        super("Кличка", Owner.createOwner("Хозяин"), LocalDate.now(), Illness.createIllness("Болеет"), 0);
        this.discount = 10D;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void meow() {
        LOGGER.info("Мяяяу!");
    }

    @Override
    public void toGo(double meters) {
        int result = (int) (movementStatistics += meters);
        LOGGER.info(String.format("Котёнок по имени %s прошёл %.2f метров. Статистика подвижности: %d", nickName, meters, result));
    }

    @Override
    public void fly(double meters) {
        int result = (int) movementStatistics;
        LOGGER.info(String.format("Котёнок по имени %s не может летать! Статистика подвижности: %d", nickName, result));
    }

    @Override
    public void swim(double meters) {
        int result = (int) movementStatistics;
        LOGGER.info(String.format("Котёнок по имени %s не любит воду и никуда не поплыл! Статистика подвижности: %d", nickName, result));
    }

    @Override
    public String toString() {
        return super.toString() + ", discount=" + discount;
    }
}

class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, double movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Dog() {
        super("Кличка", Owner.createOwner("Хозяин"), LocalDate.now(), Illness.createIllness("Болеет"), 0);
    }

    @Override
    public void toGo(double meters) {
        int result = (int) (movementStatistics += meters);
        LOGGER.info(String.format("Собака по имени %s прошла %.2f метров. Статистика подвижности: %d", nickName, meters, result));
    }

    @Override
    public void fly(double meters) {
        int result = (int) movementStatistics;
        LOGGER.info(String.format("Собака по имени %s не может летать! Статистика подвижности: %d", nickName, result));
    }

    @Override
    public void swim(double meters) {
        int result = (int) (movementStatistics += meters);
        LOGGER.info(String.format("Собака по имени %s проплыла %.2f метров. Статистика подвижности: %d", nickName, meters, result));
    }
}

class Sparrow extends Animal {
    public Sparrow(String nickName, Owner owner, LocalDate birthDate, Illness illness, double movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Sparrow() {
        super("Кличка", Owner.createOwner("Хозяин"), LocalDate.now(), Illness.createIllness("Болеет"), 0);
    }

    public void moveByJumping(double meters) {
        int result = (int) (movementStatistics += meters);
        LOGGER.info(String.format("Воробей по имени %s переместился прыжками на %.2f метров. Статистика подвижности: %d", nickName, meters, result));
    }

    @Override
    public void toGo(double meters) {
        int result = (int) movementStatistics;
        LOGGER.info(String.format("Воробей %s птица особенная, ходить не умеет, но может прыгать. Статистика подвижности: %d", nickName, result));
    }

    @Override
    public void fly(double meters) {
        int result = (int) (movementStatistics += meters);
        LOGGER.info(String.format("Воробей по имени %s пролетел %.2f метров. Статистика подвижности: %d", nickName, meters, result));
    }

    @Override
    public void swim(double meters) {
        int result = (int) (movementStatistics += meters);
        LOGGER.info(String.format("Воробей по имени %s не плавает! Статистика подвижности: %d", nickName, result));
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Гав", Owner.createOwner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 3), Illness.createIllness("Лишай"), 0.5, 10);

        Animal dog = new Dog("Чаппи", Owner.createOwner("Алексей Максимович"),
                LocalDate.of(2023, 10, 4), Illness.createIllness("Лишай"), 0);

        System.out.println("Информация о коте:");
        System.out.println(cat);
        cat.toGo(10);
        cat.swim(5);
        cat.fly(100);

        System.out.println("\n-------------------\n");

        System.out.println("Информация о собаке:");
        System.out.println(dog);
        dog.toGo(10);
        dog.fly(100);
        dog.swim(3);

        System.out.println("\n-------------------\n");

        Sparrow sparrow = new Sparrow("Облачко", Owner.createOwner("Клавдия Петровна"),
                LocalDate.of(2023, 10, 4), Illness.createIllness("Болят лапки"), 0);

        System.out.println("Информация о воробье:");
        System.out.println(sparrow);
        sparrow.fly(100);
        sparrow.toGo(10);
        sparrow.moveByJumping(50);
        sparrow.swim(30);
    }
}