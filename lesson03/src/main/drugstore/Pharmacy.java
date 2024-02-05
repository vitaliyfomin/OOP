package main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    public void addComponents(Component... components) {
        Collections.addAll(this.components, components);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.components.size(), o.components.size());
    }

    public void printSortedComponents() {
        Collections.sort(components);
        System.out.println(components);
    }
}