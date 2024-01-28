package main.clients;

import java.time.LocalDate;

public class Animal {

    // protected видно в классе и во всех наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    protected int movementStatistics;


    // Это пустой конструктор (по умолчанию)
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
        this.movementStatistics = movementStatistics;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"), 0);
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle() {
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    private void wakeUp() {
        wakeUp("12:00");
    }

    private void wakeUp(String time) {
        System.out.println("Животное " + nickName + " проснулось в " + time);
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    private void hunt() {
        System.out.println("Животное охотится!");
    }

    private void eat() {
        System.out.println("Животное ест!");
    }

    private void sleep() {
        System.out.println("Животное уснуло!");
    }


    public void toGo(int meters) {
        System.out.print("Животное (" + nickName + ") прошло " + meters + " метров. Статистика подвижности: ");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    };

    public void fly(int meters){
        System.out.print("Животное (" + nickName + ") пролетело " + meters + " метров. Статистика подвижности: ");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }

    public void swim(int meters){
        System.out.print("Животное (" + nickName + ") проплыло " + meters + " метров. Статистика подвижности: ");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s, Movement statistics = %s ", nickName, birthDate, owner, illness, movementStatistics);
    }
}