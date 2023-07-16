package com.gof.factory;

public class Server extends Computer {

	private String ram;

	public Server(String ram) {
		this.ram = ram;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

}
