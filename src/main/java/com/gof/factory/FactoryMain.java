package com.gof.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.createComputer("pc", "256 GB");
		Computer server = ComputerFactory.createComputer("server", "1000 GB");
		System.out.println("Factory PC ::" + pc);
		System.out.println("Factory Server ::" + server);
	}

}
