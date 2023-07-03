package com.exam.Services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.exam.Model.User;
import com.exam.Model.UserRole;

@Service
public interface UserService {
	
    // creating the new User
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	// Getting the user by their userName
	public User getUser(String username);
	
	// Deteting the user by passing UserId , or this can be done by passing username as well since both are unique
	public void deleteUser(Long userId);

}
