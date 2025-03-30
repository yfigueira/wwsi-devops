package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(3, 2));
        System.out.println(divide(4, 2));
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static double divide(int first, int second) {
        return (double) first / (double) second;
    }
}