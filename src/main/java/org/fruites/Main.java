package org.fruites;

import org.fruites.Entity.Apple;
import org.fruites.Entity.Orange;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Создаем коробку для яблок
        FruitBox<Apple> appleBox1 = new FruitBox<>();
        appleBox1.addFruit(new Apple(0.1));
        appleBox1.addFruit(new Apple(0.2));

        // Создаем коробку для апельсинов
        FruitBox<Orange> orangeBox = new FruitBox<>();
        orangeBox.addFruit(new Orange(0.15));
        orangeBox.addFruit(new Orange(0.18));

        // Выводим вес каждой коробки
        System.out.println("Вес коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        // Сравниваем вес двух коробок
        System.out.println("Коробки равны по весу: " + (appleBox1.getWeight() == orangeBox.getWeight()));

        // Создаем вторую коробку для яблок и пересыпаем фрукты из первой коробки
        FruitBox<Apple> appleBox2 = new FruitBox<>();
        appleBox1.transferFruits(appleBox2);

        // Проверяем, что фрукты пересыпались правильно
        System.out.println("Вес коробки с яблоками (первая): " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками (вторая): " + appleBox2.getWeight());
    }
}