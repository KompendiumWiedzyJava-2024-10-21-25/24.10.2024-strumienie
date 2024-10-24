package com.comarch.szkolenia.strumienie;

import java.util.function.*;

public class App2 {
    public static void main(String[] args) {
        Function<Integer, String> function = x -> "Taka liczba: " + x;
        System.out.println(function.apply(5));
        System.out.println(function.apply(19));
        System.out.println(function.apply(40));

        UnaryOperator<Double> unaryOperator = d -> d * 4.45;
        System.out.println(unaryOperator.apply(3.33));
        System.out.println(unaryOperator.apply(7.12));
        System.out.println(unaryOperator.apply(45.77));

        BiFunction<Integer, Double, String> biFunction = (a,b) -> "Wynik: " + (a * b);

        System.out.println(biFunction.apply(4, 5.5));
        System.out.println(biFunction.apply(7, 45.5));

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("Mateusz"));
        System.out.println(predicate.test("Karol"));

        Supplier<Car> defaultCarSupplier = () -> new Car("default brand", "default model", 0);

        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());

        Consumer<Car> consumerOld = c -> System.out.println(c);
        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("Toyota", "Corolla", 100));
        consumer.accept(defaultCarSupplier.get());

        Function<String, Integer> function2 = s -> {
            String newString = s.replace("a", "");
            if(newString.length() > 5) {
                newString = newString.replace("b", "");
                return newString.length();
            } else {
                return newString.length();
            }
        };

        Predicate<String> predicate2 = App2::cos;
    }

    public static boolean cos(String s) {
        return false;
    }
}
