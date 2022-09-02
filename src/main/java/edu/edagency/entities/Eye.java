package edu.edagency.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Eye {
	BROWN, BLUE, HAZEL, GREEN;

	public static List<String> getEyes() {
		return Arrays.stream(Eye.values()).map(e -> e.toString()).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		String str = this.name();
		return str.substring(0, 1) + str.substring(1).toLowerCase();
	}

	public static Eye toEye(String e) {
		Eye eye = null;
		switch (e.toUpperCase()) {
		case "BROWN":
			eye = Eye.BROWN;
			break;
		case "BLUE":
			eye = Eye.BLUE;
			break;
		case "HAZEL":
			eye = Eye.HAZEL;
			break;
		case "GREEN":
			eye = Eye.GREEN;
			break;
		default:
			break;
		}

		return eye;
	}
}
