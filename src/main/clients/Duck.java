package main.clients;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Swimable{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck(){
        super();
    }


    @Override
    public void fly() {

    }

    @Override
    public void go() {

    }
    @Override
    public void swim() {

    }
}