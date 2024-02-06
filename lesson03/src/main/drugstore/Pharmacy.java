package main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pharmacy {
    private List<Component> components = new ArrayList<>();

    public void addComponents(Component... components) {
        for (Component component : components) {
            if (!this.components.contains(component)) {
                this.components.add(component);
            }
        }
    }

    public void printSortedComponents() {
        Collections.sort(components);
        for (Component component : components) {
            System.out.println(component);
        }
    }
}
