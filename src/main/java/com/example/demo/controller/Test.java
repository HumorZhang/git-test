package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println(1);
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = integerList.stream().filter(i -> i > 3);
    }
}
