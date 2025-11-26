package org.example.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharFrequency {
    public static void main(String[] args) {
        String inoutString = "You are at best palace";
        inoutString =inoutString.replace(" ","");

        Map<Character, Long> frequencyMap = inoutString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
