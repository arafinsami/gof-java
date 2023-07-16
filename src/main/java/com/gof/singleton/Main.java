package com.gof.singleton;

public class Main {

    public static void main(String[] args) {
        SingleTone instanceOne = SingleTone.getInstance();
        SingleTone instanceTwo = SingleTone.getInstance();
        if (instanceOne.hashCode() == instanceTwo.hashCode()) {
            System.out.println("single object created:   " + instanceOne);
        } else {
            System.out.println("single object not created");
        }
    }
}
