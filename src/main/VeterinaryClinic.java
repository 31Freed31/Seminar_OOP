package main;

import main.clients.*;
import main.personal.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;

public class VeterinaryClinic {
    public static void main(String[] args){


        Doctor doctor = new Doctor();
        Assistant assistantOne = new Assistant();
        Assistant assistantTwo = new Assistant();

        Nurse nurseOne = new Nurse();
        Nurse nurseTwo = new Nurse();
        Nurse nurseThree = new Nurse();

        List<BaseStaff> staff = new ArrayList<>();
        staff.add(doctor);
        staff.add(assistantOne);
        staff.add(assistantTwo);

        staff.add(nurseOne);
        staff.add(nurseTwo);
        staff.add(nurseThree);

        System.out.println("Численность персонала: " + staff.size());
        System.out.println(staff);

        System.out.println("\n");

        List<Goable> list = new ArrayList<>();

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        list.add(cat);
        list.add(cat2);

        Duck duck = new Duck();
        list.add(duck);

        Dog dog = new Dog();
        list.add(dog);


        System.out.println("Численность пациентов: " + list.size());
        System.out.println(list);

    }
}