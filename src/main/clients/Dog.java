package main.clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }
    public Dog(){
        super();
    }
    @Override
    public void fly(int meters) {
        System.out.print("Собака по имени " + nickname + " не умеет летать" + "\n");
    }

}
