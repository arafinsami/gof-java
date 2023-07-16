package com.gof.factory;

public class ComputerFactory {

	public static Computer createComputer(String type, String ram) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC("256 GB");
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server("1000 GB");
		}
		return null;
	}

}
