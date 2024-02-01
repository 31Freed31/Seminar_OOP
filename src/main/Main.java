package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");

        Animal cat = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021,10,05), new Illness("Лишай"), 0.5);

        System.out.println(cat);
        cat.toGo(100);
        cat.swim(5);
        cat.fly(10);

        System.out.println("\n");

        Animal dog = new Dog("«Шарик»", new Owner("Артём Максмимов"),
                LocalDate.of(2022, 11, 07), new Illness("Блохи"));

        System.out.println(dog);
        dog.toGo(300);
        dog.fly(5);
        dog.swim(7);

        System.out.println("\n");

        Animal duck = new Duck("«Кряк»", new Owner("Ирина игнатьевна"),
                LocalDate.of(2020, 04, 24), new Illness("Укусы"));

        System.out.println(duck);
        duck.toGo(20);
        duck.fly(15);
        duck.swim(80);

        System.out.println("\n");

        Animal fish = new Fish("«Бульк»", new Owner("Пётр Михалыч"),
                LocalDate.of(2023, 12, 10), new Illness("Ушибы"));

        System.out.println(fish);
        fish.toGo(20);
        fish.fly(15);
        fish.swim(500);




    }
}