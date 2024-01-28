package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    @Override
    public void fly(int meters) {
        System.out.print("Собака по имени " + nickName + " может летать только во снах! Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }

}
