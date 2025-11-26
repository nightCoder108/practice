package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOddEven {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3,5,6,31,22);
        List<Integer> evenNumberList = inputList.stream().filter(num-> num%2 ==0).collect(Collectors.toList());
        List<Integer> oddNumberList =inputList.parallelStream().filter(num->num%2 != 0).collect(Collectors.toList());

        System.out.println("even number"+evenNumberList);
        //evenNumberList.forEach(System.out::print);
        System.out.println("\nOdd number" +oddNumberList);
        //oddNumberList.forEach(System.out::println);
    }
}
