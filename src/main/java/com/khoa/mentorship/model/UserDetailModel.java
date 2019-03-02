package com.khoa.mentorship.model;

public class UserDetailModel {
	
	private String email;
	private int titleId;
	private int universityId;
	private String description;
	private String website;
	private boolean visible;
	
	private int highschoolId;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getHighschoolId() {
		return highschoolId;
	}

	public void setHighschoolId(int highschoolId) {
		this.highschoolId = highschoolId;
	}

}
