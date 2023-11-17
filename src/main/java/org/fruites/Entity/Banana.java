package org.fruites.Entity;

import org.fruites.Interface.Fruit;

// Класс для бананов
class Banana implements Fruit {
    private double weight;

    public Banana(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
