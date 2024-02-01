package main.clients;

import java.time.LocalDate;

public class Fish extends Animal{

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish(){
        super();
    }

    @Override
    public void fly(int meters) {
        System.out.print("Рыбка по имени " + nickname + " не умеет летать! " + "\n");
        return;
    }
    @Override
    public void toGo(int meters){
        System.out.print("Рыбка по имени " + nickname + " не умеет ходить!" + "\n");
    }
}
