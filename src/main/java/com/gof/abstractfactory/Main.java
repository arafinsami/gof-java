package com.gof.abstractfactory;

public class Main {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PCFactory("256 GB"));
        System.out.println("AbstractFactory PC ::" + pc);
    }
}
