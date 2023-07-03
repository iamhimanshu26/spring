package com.exam.Impl;

import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.exam.Model.User;
import com.exam.Model.UserRole;
import com.exam.Repository.RoleRepository;
import com.exam.Repository.UserRepository;
import com.exam.Services.UserService;

@Service
public class UserServiceImpl implements UserService{
		
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	// Creating the new user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// To check if the user is already present or not
		User existingUser= this.userRepository.findByUserName(user.getUserName());
		if(existingUser != null) {
			System.out.println("User is already present ..");
			throw new Exception("User already existed");
		}else {
			// creating new user here
			// To save multiple users , we are using forEach loop
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());  // this loop will help us to find the role for the user from the DB.
			}
			user.getUserRoles().addAll(userRoles);  // this line will assign the new role to the new user
			existingUser = this.userRepository.save(user);  // this line will return the new saved user which we are returning below.

		}
		return existingUser;
//		return this.userRepository.save(user);
	}

	// Getting user details by UserName
	@Override
	public User getUser(String username) {
		
		// This getUser() method will internally call the findByUserName() from UserService interface.
		// Now we just need to implement its handler as well in the controller.
		return this.userRepository.findByUserName(username);
	}

	@Override
	public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);		
	}
	
	

}
