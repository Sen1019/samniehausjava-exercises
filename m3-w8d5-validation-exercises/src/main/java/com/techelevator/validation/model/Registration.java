package com.techelevator.validation.model;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message = "First name is required.") @Length(max = 20, message = "First name too long.")
	private String firstName;
	
	@NotBlank(message = "Last name is required.") @Length(max = 20, message = "Last name too long.")
	private String lastName;
	
	@NotBlank(message = "Email address is required.") @Email(message = "Please enter a vaild email address.")
	private String email;
	
	@NotBlank(message = "Confirm email address is required.")
	private String confirmEmail;
	
	@NotBlank(message = "Password is required.") @Length(min = 8, message = "Password must be at least eight characters.")
	private String password;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy") @Past
	private Date birthDate;
	
	@NotBlank(message = "Confirm password is required.")
	private String confirmPassword;
	
	@NotBlank(message = "Please entered the desired number of tickets") @Length(min = 1, max = 10, message = "Number of tickets must be between 1 and 10.")
	private String numberOfTickets;

	private boolean passwordMatching;
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(confirmPassword);
		} else {
			return false;
		}
	}
	
	private boolean emailMatching;
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(confirmEmail);
		} else {
			return false;
		}
	}
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(String numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
