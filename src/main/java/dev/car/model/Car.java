package dev.car.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAR_ID")
	private int id;
	@Column(name = "CAR_TYPE")
	private String typeof;
	@Column(name = "CAR_NUMBER")
	private String carNumber;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PHONE_NUMBER")
	private String phoneNum;
	@Column(name = "PARKED_LOCATION")
	private String location;

	public Car() {
	}

	public Car(String typeof, String carNumber, String name, String phoneNum) {
		this.typeof = typeof;
		this.carNumber = carNumber;
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeof() {
		return typeof;
	}

	public void setTypeof(String typeof) {
		this.typeof = typeof;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", typeof=" + typeof + ", carNumber=" + carNumber + ", name=" + name + ", phoneNum="
				+ phoneNum + ", location=" + location + "]";
	}

}
