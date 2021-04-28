package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	 	@Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    @Column(name="id")
	    private int id;
	    @Column(name="first_name")
	    private String firstName;
	    @Column(name="last_name")
	    private String lastName;
	    @Column(name="email")
	    private String email;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id, String firstName, String lastName, String email) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
		}
	    
	   
}
