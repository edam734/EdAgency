package edu.edagency.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Size(min = 3, max = 25)
	private String name;

	@NotNull
	@Size(min = 3, max = 254)
	private String email;

	@NotNull
	private Date birthdate;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private EyeColor eyes;

	private Float height;

	@Enumerated(EnumType.STRING)
	private ShirtSize shirt;

	private Integer shoes;

	private String instagram;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
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
	public Float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Float height) {
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
	public Integer getShoes() {
		return shoes;
	}

	/**
	 * @param shoes the shoes to set
	 */
	public void setShoes(Integer shoes) {
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
	public EyeColor getEyes() {
		return eyes;
	}

	/**
	 * @param eyes the eyes to set
	 */
	public void setEyes(EyeColor eyes) {
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
