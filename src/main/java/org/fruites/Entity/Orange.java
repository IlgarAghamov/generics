package org.fruites.Entity;

import org.fruites.Interface.Fruit;

// Класс для апельсинов
public class Orange implements Fruit {
    private double weight;

    public Orange(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
