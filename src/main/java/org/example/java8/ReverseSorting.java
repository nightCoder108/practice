package org.example.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSorting {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3,5,6,31,22,1);
        java8(inputList);
        notJava8(inputList);
    }
    private static void java8(List<Integer> inputList){
        inputList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    private static void notJava8(List<Integer> inputList){
        /*Arrays.sort(inputList.toArray(), Collections.reverseOrder());
        for (int i : inputList) {
            System.out.print(i + " ");
        }*/
    }
}
