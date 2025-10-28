package org.example.epam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceCounter {
    public static void main(String[] args) {
        System.out.println(getMaxOccurChar("aannjjffff"));
    }
    private static char getMaxOccurChar(String inputString){
        Map<Character,Long> freqMap = inputString.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()));
        char result =0;
        long maxCount = 0;
        for(char ch : inputString.toCharArray()){
            long count = freqMap.get(ch);
            if(count>maxCount){
                maxCount= count;
                result=ch;
            }
        }
        return result;
    }
}