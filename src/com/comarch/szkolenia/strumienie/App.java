package com.comarch.szkolenia.strumienie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mateusz");
        list.add("Zbyszek");
        list.add("Adam");
        list.add("Wiesiek");
        list.add("Janusz");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 100));
        cars.add(new Car("Audi", "A5", 200));
        cars.add(new Car("BMW", "3", 180));
        cars.add(new Car("Kia", "Ceed", 90));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c1.getBrand().compareTo(c2.getBrand()));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c2.getPrice() - c1.getPrice());

        System.out.println(cars);

        Car car = new Car();
        JakisInterfejs obiekt = new JakisInterfejs() {
            @Override
            public void x() {
                System.out.println("cos tam");
            }

            @Override
            public int y() {
                return 7;
            }
        };

        obiekt.x();
        obiekt.y();

        InterfejsFunkcyjny obiektInterfejsuFunkcyjnego = a -> System.out.println("przyszlo takie a: " + a);
        obiektInterfejsuFunkcyjnego.mojaMetoda(5);
    }
}
