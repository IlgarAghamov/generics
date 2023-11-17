package org.fruites;

import org.fruites.Interface.Fruit;

import java.util.ArrayList;
import java.util.List;

// Обобщенный класс для коробки с фруктами
class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    // Метод для добавления фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Метод для расчета веса коробки
    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    // Метод для пересыпания фруктов из одной коробки в другую
    public void transferFruits(FruitBox<T> destinationBox) {
        destinationBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
