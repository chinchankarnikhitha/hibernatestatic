package com.example.hibernateprj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//table insertion
@Table(name="hibernate")
public class hiber {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@Column(name="email")//for changing col name
	private String Email;
	
	private String password;
	private long phonenumber;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public hiber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hiber(int id, String name, String email, String password, long phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.Email = email;
		this.password = password;
		this.phonenumber = phonenumber;
	}
 	
}
