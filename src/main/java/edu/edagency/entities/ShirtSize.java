package edu.edagency.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ShirtSize {
	S, M, L, XL, XXL;

	public static List<String> getShirts() {
		return Arrays.stream(ShirtSize.values()).map(s -> s.toString()).collect(Collectors.toList());
	}

	public static ShirtSize toShirtSize(String s) {
		ShirtSize shirt = null;
		switch (s.toUpperCase()) {
		case "S":
			shirt = ShirtSize.S;
			break;
		case "M":
			shirt = ShirtSize.M;
			break;
		case "L":
			shirt = ShirtSize.L;
			break;
		case "XL":
			shirt = ShirtSize.XL;
			break;
		case "XXL":
			shirt = ShirtSize.XXL;
			break;
		default:
			break;
		}
		return shirt;
	}
}
