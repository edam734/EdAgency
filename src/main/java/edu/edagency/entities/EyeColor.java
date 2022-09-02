package edu.edagency.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum EyeColor {
	BROWN, BLUE, HAZEL, GREEN;

	public static List<String> getEyes() {
		return Arrays.stream(EyeColor.values()).map(e -> e.toString()).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		String str = this.name();
		return str.substring(0, 1) + str.substring(1).toLowerCase();
	}

	public static EyeColor toEye(String e) {
		EyeColor eye = null;
		switch (e.toUpperCase()) {
		case "BROWN":
			eye = EyeColor.BROWN;
			break;
		case "BLUE":
			eye = EyeColor.BLUE;
			break;
		case "HAZEL":
			eye = EyeColor.HAZEL;
			break;
		case "GREEN":
			eye = EyeColor.GREEN;
			break;
		default:
			break;
		}

		return eye;
	}
}
