package com.java8.generics;

public class GenericExample {
    public static void main(String[] args) {
        IntegerCounter integerCounter = new IntegerCounter(10);
        integerCounter.print();
        DoubleCounter doubleCounter = new DoubleCounter(5.0);
        doubleCounter.print();

        Counter<Integer> icounter = new Counter<Integer>(10);
        icounter.print();

        Counter<Double> dcounter = new Counter<>(10.0);
        dcounter.print();

    }
}
