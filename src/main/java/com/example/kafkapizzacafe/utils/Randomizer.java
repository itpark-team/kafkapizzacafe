package com.example.kafkapizzacafe.utils;

public class Randomizer {
    public static int getInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
