package edu.edagency.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private Date birthdate;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Enumerated(EnumType.STRING)
	private Eye eyes;
	private float height;
	@Enumerated(EnumType.STRING)
	private ShirtSize shirt;
	private int shoes;
	private String instagram;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the shirt
	 */
	public ShirtSize getShirt() {
		return shirt;
	}

	/**
	 * @param shirt the shirt to set
	 */
	public void setShirt(ShirtSize shirt) {
		this.shirt = shirt;
	}

	/**
	 * @return the shoes
	 */
	public int getShoes() {
		return shoes;
	}

	/**
	 * @param shoes the shoes to set
	 */
	public void setShoes(int shoes) {
		this.shoes = shoes;
	}

	/**
	 * @return the instagram
	 */
	public String getInstagram() {
		return instagram;
	}

	/**
	 * @param instagram the instagram to set
	 */
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	/**
	 * @return the eyes
	 */
	public Eye getEyes() {
		return eyes;
	}

	/**
	 * @param eyes the eyes to set
	 */
	public void setEyes(Eye eyes) {
		this.eyes = eyes;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public String toString() {
//		return "Agent [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", eyes=" + eyes + ", hair=" + hair
//				+ ", height=" + height + ", shirt=" + shirt + ", shoes=" + shoes + ", instagram=" + instagram + "]";
//	}

}
