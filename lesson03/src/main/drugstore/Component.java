package main.drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public String getTitle() {
        return title;
    }

    public Double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        // Сравниваем компоненты по названию
        return this.title.compareTo(o.getTitle());
    }
}
