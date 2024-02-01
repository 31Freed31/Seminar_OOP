package main.clients;

import java.time.LocalDate;

public class Animal {
    protected String nickname ;
    protected Owner owner ;
    protected LocalDate birthDate ;
    protected Illness illness ;

    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickname = nickname ;
        this.owner = owner ;
        this.birthDate = birthDate ;
        this.illness = illness ;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет")) ;
    }

    public String getNickname() {
        return nickname;
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

    public void lifeCycle(){
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    private void wakeUp(){
        wakeUp("12:00");
    }

    private void wakeUp(String time){
        System.out.println("Животное " + nickname + " проснулось в " + time);
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    private void hunt(){
        System.out.println("Животное охотится");
    }

    private void eat() {
        System.out.println("Животное ест");
    }
    private void sleep() {
        System.out.println("Животное уснуло");
    }

    public void toGo(int meters) {
        System.out.print("Животное (" + nickname + ") прошло " + meters + " метров" + "\n");
    };

    public void fly(int meters){
        System.out.print("Животное (" + nickname + ") пролетело " + meters + " метров" + "\n");
    }

    public void swim(int meters){
        System.out.print("Животное (" + nickname + ") проплыло " + meters + " метров" + "\n");
    }

    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s", nickname, birthDate, owner, illness) ;
    }
}
