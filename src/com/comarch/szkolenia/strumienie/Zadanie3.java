package com.comarch.szkolenia.strumienie;

import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "dy", "e", "f", "gy", "yh");

        List<String> result = list.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .toList();
        System.out.println(result);

        String x = "aB.c";
        System.out.println(x.replaceAll("\\.", ""));
    }
}
