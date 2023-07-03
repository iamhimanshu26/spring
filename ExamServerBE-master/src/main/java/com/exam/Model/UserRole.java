package com.exam.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
// This class simply consist the data of the users and their roles , means a connected table b/w users and roles.
public class UserRole {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	
	@ManyToOne(fetch= FetchType.EAGER)
	private User user;
	
	@ManyToOne
	private Role role;

	public UserRole(long Id, User user, Role role) {
		super();
		this.Id = Id;
		this.user = user;
		this.role = role;
	}

	public UserRole() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRole [Id=" + Id + ", user=" + user + ", role=" + role + "]";
	}
	
}
