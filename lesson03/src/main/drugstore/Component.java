package main.drugstore;

import java.util.List;

public abstract class Component implements Comparable<Component> {
    private static int nextId = 1;
    private int id;
    private String title;
    private Double weight;
    private int power;

    // Конструктор с параметрами
    public Component(String title, Double weight, int power) {
        this.id = nextId++;
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    // Геттеры для id, title, weight и power
    public int getId() {
        return id;
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

    // Переопределение метода compareTo
    @Override
    public int compareTo(Component other) {
        // Сначала сравниваем названия компонент
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }

        // Если названия одинаковы, сравниваем силу компонент
        return Integer.compare(this.getPower(), other.getPower());
    }
}