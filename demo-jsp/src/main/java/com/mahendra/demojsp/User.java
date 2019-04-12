package com.mahendra.demojsp;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

//Using JSR-303 Annotation driven validation
public class User {
	@NotEmpty(message="please enter your first name")
	private String firstName;
	
	@NotEmpty(message="Please enter your last name")
	private String lastName;
	
	
private Date dateOfBirth;
	
	@Email(message="Invalid email address!")
private String email;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String firstName, String lastName, Date dateOfBirth, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.email = email;
}


}
