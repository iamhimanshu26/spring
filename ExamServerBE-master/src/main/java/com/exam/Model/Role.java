package com.exam.Model;

import java.util.HashSet;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	
	@Id
	private long roleId;
	private String roleType;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(cascade= CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "role")
	@JsonIgnore
	private Set<UserRole> userRoles= new HashSet<>();
	
	public Role(long roleId, String roleType , Set<UserRole> userRoles) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
		this.userRoles= userRoles;
	}
		
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleType=" + roleType + "]";
	}

}
