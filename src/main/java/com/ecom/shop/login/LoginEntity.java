package com.ecom.shop.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginEntity {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String pwd;
	private String phoneno;
	private String email;
	private String address;
	
	public Long getId() {
		return id;
		}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginEntity(Long id, String username, String pwd, String phoneno, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.phoneno = phoneno;
		this.email = email;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", username=" + username + ", pwd=" + pwd + ", phoneno=" + phoneno + ", email="
				+ email + ", address=" + address + "]";
	}
	


	
	
	
	
	

}
