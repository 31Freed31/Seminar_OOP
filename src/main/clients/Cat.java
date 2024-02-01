package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {

    Double discount;
    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
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

    public static void meow(){
        System.out.println("Мяу");
    }


    @Override
    public String toString() {
        return super.toString() + "Discount("+discount+")";
    }

    @Override
    public void fly(int meters) {
        System.out.print("Котёнок по имени " + nickname + " не умеет летать! " + "\n");
        return;
    }
    @Override
    public void swim(int meters){
        System.out.print("Котёнок по имени " + nickname + " не любит плавать!" + "\n");
    }


}
