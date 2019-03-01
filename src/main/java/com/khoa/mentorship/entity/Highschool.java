package com.khoa.mentorship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HIGHSCHOOL")
public class Highschool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "highschool_id")
	private int highschoolId;
	
	@Column(name = "highschool_name")
	private String highschoolName;
	
	@Column(name = "highschool_address")
	private String highschoolAddress;

	public int getHighschoolId() {
		return highschoolId;
	}

	public void setHighschoolId(int highschoolId) {
		this.highschoolId = highschoolId;
	}

	public String getHighschoolName() {
		return highschoolName;
	}

	public void setHighschoolName(String highschoolName) {
		this.highschoolName = highschoolName;
	}

	public String getHighschoolAddress() {
		return highschoolAddress;
	}

	public void setHighschoolAddress(String highschoolAddress) {
		this.highschoolAddress = highschoolAddress;
	}

}
