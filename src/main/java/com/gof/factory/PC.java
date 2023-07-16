package com.gof.factory;

public class PC extends Computer {

	private String ram;

	public PC(String ram) {
		this.ram = ram;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

}
