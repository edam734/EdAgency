package edu.edagency.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Gender {
	MALE("M"), FEMALE("F");

	String abrv;

	Gender(String abrv) {
		this.abrv = abrv;
	}

	/**
	 * @return the abrv
	 */
	public String getAbrv() {
		return abrv;
	}
	
	public static List<String> getList() {
		Gender[] genders = Gender.values();
		return Arrays.stream(genders).map(e -> e.getAbrv()).collect(Collectors.toList());
	}
	
	public static Gender toGender(String abrv) {
		Gender gender = null;
		if ("M".equals(abrv.toUpperCase())) {
			gender = Gender.MALE;
		} else if ("F".equals(abrv.toUpperCase())) {
			gender = Gender.FEMALE;
		}
		return gender;
	}

	@Override
	public String toString() {
		return this.getAbrv();
	}
}
