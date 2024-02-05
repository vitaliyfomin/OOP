package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Вода", 10D, 1);
        Component azitronite = new Azitronite("Азиттронит", 2D, 14);
        Component penicillin = new Penicillin("Пенициллин", 1.6D, 6);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(water, azitronite);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(penicillin, water);

        pharmacy1.printSortedComponents();
        pharmacy2.printSortedComponents();
    }
}
