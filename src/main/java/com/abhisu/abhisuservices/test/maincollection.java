package com.abhisu.abhisuservices.test;

import java.util.*;

public class maincollection {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        TreeSet<Number> asctreeset = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,9,8,7,6));


//        lists.parallelStream().forEach(System.out::println);
        asctreeset.stream().forEach(System.out::println);
    }
}
