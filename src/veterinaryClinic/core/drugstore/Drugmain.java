package veterinaryClinic.core.drugstore;

import veterinaryClinic.core.drugstore.components.Azitronite;
import veterinaryClinic.core.drugstore.components.Penicillin;
import veterinaryClinic.core.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 2);
        Component azitronite = new Azitronite("Azitronite", 10D, 25);
        Component penicillin = new Penicillin("penicillin", 1.4D, 11);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicillin, water);

        Pharmacy2 p3 = new Pharmacy2();
        p2.addComponents(penicillin, azitronite);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        System.out.println("\n");

        DrugStore ds = new DrugStore();
        ds.addPharmacies(p1, p2, p3);
        for(Pharmacy2 p:ds){
            System.out.println(p);
        }

        ds.sortByPower();

        System.out.println("\n");

        for(Pharmacy2 p:ds.getPharmacies()){
            System.out.println(p);
        }

        ds.sortByWeight();
        System.out.println("\n");

        for(Pharmacy2 p:ds.getPharmacies()){
            System.out.println(p);
        }






    }
}
