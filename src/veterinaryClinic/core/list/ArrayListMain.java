package veterinaryClinic.core.list;

import veterinaryClinic.core.list.core.GBList;
import veterinaryClinic.core.list.core.lists.GBLinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> lnkd = new GBLinkedList<>();
        lnkd.add(1); lnkd.add(2); lnkd.add(3); lnkd.add(4); lnkd.add(5); lnkd.add(6);

        System.out.println("Заполненный список: ");
        System.out.println(lnkd);
        System.out.println("\b");

        System.out.println("Удаляем пятый элемент: ");
        lnkd.remove(5);
        System.out.println(lnkd);
        System.out.println("\b");

        System.out.println("Удаляем элемент с индексом 1: ");
        lnkd.remove(1);
        System.out.println(lnkd);
        System.out.println("\b");

        System.out.println("Размер списка: ");
        System.out.println(lnkd.size());
        System.out.println("\b");


        System.out.println("Добавляем несколько элементов с начала: ");
        lnkd.addElem(-1);
        lnkd.addElem(10);
        lnkd.addElem(0);
        System.out.println(lnkd);
        System.out.println("\b");

        System.out.println("2 элемент: ");
        System.out.println(lnkd.get(2));
        System.out.println("\b");

        System.out.println("5 элемент: ");
        System.out.println(lnkd.get(5));
        System.out.println("\b");


        System.out.println("Итерация: ");
        for(Integer item: lnkd){
            System.out.println(item + " кот");
        }

    }
}
