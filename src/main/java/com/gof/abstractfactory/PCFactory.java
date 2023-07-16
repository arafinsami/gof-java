package com.gof.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;

    public PCFactory(String ram) {
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram);
    }
}
