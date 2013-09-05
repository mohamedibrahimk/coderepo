package com.ibr.storeinventory.ui.form;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserSignupForm implements Serializable{

	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String emailId;
	@NotNull @Size(max=10)
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;
	private String age;
	private String occupation;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String userId) {
		this.emailId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}		

}
