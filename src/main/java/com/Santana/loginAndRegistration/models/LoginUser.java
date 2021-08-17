package com.Santana.loginAndRegistration.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
    
public class LoginUser {
//	----------------------MemberVariables(column Names)---------------------------//

    @NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;
    
    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
//	----------------------MemberVariables(column Names) End-----------------------//
    
//    Unloaded Constructor
    public LoginUser() {}

//	----------------------Getters & Setter----------------------------------------//

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
//	----------------------Getters & Setter End------------------------------------//

    
}
