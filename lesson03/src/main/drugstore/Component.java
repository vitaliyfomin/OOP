package main.drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    // Конструктор без параметров
    public Component() {
        this.title = "";
        this.weight = 0.0;
        this.power = 0;
    }

    // Конструктор с параметрами
    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Переопределение метода compareTo
    @Override
    public int compareTo(Component other) {
        return Integer.compare(this.power, other.power);
    }
}
