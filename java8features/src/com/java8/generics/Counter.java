package com.java8.generics;

public class Counter<T extends Number> {
    T t;

    public Counter(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }
}
