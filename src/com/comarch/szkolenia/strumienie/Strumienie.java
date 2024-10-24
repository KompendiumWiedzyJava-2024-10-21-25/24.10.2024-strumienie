package com.comarch.szkolenia.strumienie;

import java.io.InputStream;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strumienie {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,5,6,7,5,8,7,9,10,30);

        list.stream()
                .filter(x -> x > 3)
                .peek(System.out::println)
                .filter(x -> x < 8)
                .peek(System.out::println)
                .limit(2)
                .forEach(System.out::println);


        /*List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 100));
        cars.add(new Car("Audi", "A5", 200));
        cars.add(new Car("BMW", "3", 180));
        cars.add(new Car("Kia", "Ceed", 90));


        cars.stream()
                .map(Car::getBrand)
                .filter(s -> s.contains("i"))
                .limit(1)
                .forEach(System.out::println);*/

        /*Optional<Car> carBox = findCar("Audi");
        if(carBox.isEmpty()) {
            //???
        } else {
            System.out.println(carBox.get().getPrice());
        }*/
    }

    /*public static Optional<Car> findCar(String brand) {
        //Mamy liste aut i szukamy o danej marce i zwracamy
        if(brand.equals("BMW")) {
            return Optional.of(new Car("BMW", "3", 123));
        } else {
            return Optional.empty();
        }
    }*/
}
