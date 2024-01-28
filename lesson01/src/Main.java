import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Owner {
    String fullName;

    Owner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}

class Illness {
    String title;

    Illness(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "title='" + title + '\'' +
                '}';
    }
}

abstract class Animal {
    String nickName;
    LocalDate birthDate;
    Owner owner;
    Illness illness;
    int movementStatistics;
    List<String> actions = new ArrayList<>();

    Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
        this.movementStatistics = movementStatistics;
    }

    abstract void move();

    abstract void makeSound();

    void sleep() {
        actions.add(nickName + " sleeps.");
    }

    void eat() {
        actions.add(nickName + " eats.");
    }

    void printInfo() {
        actions.add("Информация о " + getClass().getSimpleName() + ":");
        actions.add("nickName='" + nickName + "', birthDate=" + birthDate +
                ", owner=" + owner + ", illness=" + illness +
                ", movementStatistics=" + movementStatistics);
        actions.add("-------------------");
    }

    @Override
    public String toString() {
        return String.join("\n", actions);
    }

    void toGo(int meters) {
        updateMovementStatistics(meters, "прошло " + meters + " метров");
    }

    void fly(int meters) {
        updateMovementStatistics(meters, "пролетело " + meters + " метров");
    }

    void swim(int meters) {
        updateMovementStatistics(meters, "проплыло " + meters + " метров");
    }

    protected void updateMovementStatistics(int meters, String action) {
        actions.add(String.format("Животное %s %s. Статистика подвижности: %d",
                nickName, action, movementStatistics += meters));
    }
}

class Cat extends Animal {
    double discount;

    Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics, double discount) {
        super(nickName, owner, birthDate, illness, movementStatistics);
        this.discount = discount;
    }

    @Override
    void move() {
        actions.add("Cat moves.");
        movementStatistics += 10;
    }

    @Override
    void makeSound() {
        actions.add("Meow!");
    }

    void specialAction() {
        actions.add("Cat purrs.");
    }
}

class Dog extends Animal {
    Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    @Override
    void move() {
        actions.add("Dog moves.");
        movementStatistics += 5;
    }

    @Override
    void makeSound() {
        actions.add("Woof!");
    }

    void specialAction() {
        actions.add("Dog wags its tail.");
    }
}

class Sparrow extends Animal {
    Sparrow(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    @Override
    void move() {
        actions.add("Sparrow moves.");
        movementStatistics += 20;
    }

    @Override
    void makeSound() {
        actions.add("Chirp-chirp!");
    }

    void specialAction() {
        actions.add("Sparrow flaps its wings.");
    }
}

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Сергей Валерьевич");
        Illness illness1 = new Illness("Лишай");
        Cat cat = new Cat("Гав", owner1, LocalDate.parse("2021-10-03"), illness1, 10, 0.5);

        Owner owner2 = new Owner("Алексей Максимович");
        Illness illness2 = new Illness("Лишай");
        Dog dog = new Dog("Чаппи", owner2, LocalDate.parse("2023-10-04"), illness2, 0);

        Owner owner3 = new Owner("Клавдия Петровна");
        Illness illness3 = new Illness("Болят лапки");
        Sparrow sparrow = new Sparrow("Облачко", owner3, LocalDate.parse("2023-10-04"), illness3, 0);

        cat.move();
        cat.makeSound();
        cat.sleep();
        cat.eat();
        cat.specialAction();
        cat.toGo(5); // Пример вызова метода toGo
        cat.fly(10); // Пример вызова метода fly
        cat.swim(3); // Пример вызова метода swim

        dog.move();
        dog.makeSound();
        dog.sleep();
        dog.eat();
        dog.specialAction();
        dog.toGo(8); // Пример вызова метода toGo
        dog.fly(15); // Пример вызова метода fly
        dog.swim(2); // Пример вызова метода swim

        sparrow.move();
        sparrow.makeSound();
        sparrow.sleep();
        sparrow.eat();
        sparrow.specialAction();
        sparrow.toGo(15); // Пример вызова метода toGo
        sparrow.fly(25); // Пример вызова метода fly
        sparrow.swim(0); // Пример вызова метода swim

        // Print information at the end
        cat.printInfo();
        dog.printInfo();
        sparrow.printInfo();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(sparrow);
    }
}
