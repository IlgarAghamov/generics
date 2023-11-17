package org.fruites.Entity;

import org.fruites.Interface.Fruit;

// Класс для яблок
public class Apple implements Fruit {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
