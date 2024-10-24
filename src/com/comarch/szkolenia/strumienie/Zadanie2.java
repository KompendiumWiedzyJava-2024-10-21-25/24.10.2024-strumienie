package com.comarch.szkolenia.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie2 {
    public static void main(String[] args) {
        //mamy liste liczb
        //policz srednia ale tylko parzystych liczb

        List<Integer> list = List.of(23,234,675,45,34,564,435,23,435,546,34,524);

        int sum = 0;
        int evenCouter = 0;
        for (int i : list) {
            if(i % 2 == 0) {
                sum += i;
                evenCouter++;
            }
        }
        System.out.println(sum / (double) evenCouter);

        list.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(i -> i)
                .average()
                .ifPresent(System.out::println);

        /*int a = 5;
        int wynik;
        switch(a) {
            case 1:
                wynik = 5;
                break;
            case 2:
                wynik = 6;
                break;
            case 3:
                wynik = 7;
                break;
            case 5:
                wynik = 8;
                break;
        }*/

        int a = 5;
        int wynik = switch(a) {
            case 1 -> 5;
            case 2 -> 6;
            case 3 -> 7;
            case 4 -> 8;
            default -> 10;
        };
    }
}
