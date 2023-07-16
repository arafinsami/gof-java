package com.gof.factory;

public abstract class Computer {

    public abstract String getRam();

    @Override
    public String toString() {
        return "RAM= " + this.getRam();
    }

}
