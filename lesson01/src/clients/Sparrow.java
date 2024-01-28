package main.clients;

import java.time.LocalDate;

public class Sparrow extends Animal{
    public Sparrow(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Sparrow(){
        super();
    }

    public void moveByJumping(int meters){
        System.out.print("Воробей по имени " + nickName + " переместилось прыжками " + meters + " метров. Статистика подвижности: ");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }

    @Override
    public void toGo(int meters) {
        System.out.print("Воробей " + nickName + " птица особенная, ходить не умеет, но может прыгать moveByJumping(). Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }

    @Override
    public void swim(int meters){
        System.out.print("Воробей по имени " + nickName + " не плавает! Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }
}
