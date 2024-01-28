package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {

    //Todo напомнить в чём разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics); //Todo сначала конструктор Супер-класса
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //Todo статикой пользоваться аккуратно ( пароли там не хранить :-) )
    public void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }

    @Override
    public void toGo(int meters) {
        System.out.print("Котёнок по имени " + nickName + " прошёл " + meters + " метров. Статистика подвижности: ");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    };

    @Override
    public void fly(int meters) {
        System.out.print("Котёнок по имени " + nickName + " не может летать! Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
        System.out.println();
        System.out.println("⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢀⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⡄⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣦⡀⣀⣀⣀⠀⣰⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣼⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣷⡀⠀⠀⠀");
        System.out.println("⠀⠀⣀⣸⣿⣿⣿⠁⠀⠀⢻⣿⣿⣿⣿⣿⣿⠁⠀⠈⣿⣿⣿⣇⣀⠀⠀");
        System.out.println("⠀⢀⣀⣸⣿⣿⣿⣦⣀⣠⣿⣿⣿⣿⣿⣿⣿⣤⣀⣴⣿⣿⣿⣿⣀⡀⠀");
        System.out.println("⠀⠀⢀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⡀⠀⠀");
        System.out.println("⠀⠀⠉⠀⠹⣿⣿⣿⣿⣧⠀⠉⠁⠀⠈⠉⠁⣸⣿⣿⣿⣿⠟⠀⠉⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣷⣦⣤⣤⣤⣤⣾⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    @Override
    public void swim(int meters){
        System.out.print("Котёнок по имени " + nickName + " не любит воду и никуда не поплыл! Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }

}
