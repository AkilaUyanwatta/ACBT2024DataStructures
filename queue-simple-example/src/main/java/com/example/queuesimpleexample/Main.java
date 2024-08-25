package com.example.queuesimpleexample;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> candicates = new LinkedList<>();
        candicates.add("Anura");
        candicates.add("Dilith");
        candicates.add("Namal");

        String polledValue = candicates.poll();

        System.out.println(polledValue);

    }
}