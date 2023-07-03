package com.exam.Controller;

import java.util.HashSet;
import java.util.Set;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.Model.Role;
import com.exam.Model.User;
import com.exam.Model.UserRole;
import com.exam.Services.UserService;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("test")
	public String getMsg() {
		return "working....";
	}
	
	// creating user - 
	@PostMapping("/")   // we are using this anno because we want this handler method to store the data coming from UI
	public User createUser(@RequestBody User user) throws Exception {
		
		// This roles object will take only UserRole as a parameter.
		Set<UserRole> roles= new HashSet<>();
		user.setProfile("default.png");
		
		Role role= new Role();
		role.setRoleId(55L);
		role.setRoleType("Normal");
		
		// We need two fields to pass into the UserRole entity hence first one is User object form above which is storing
		// the data coming from the UI and second one is Role object which we have just setted-up. 
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
		
	}
	
	// Handler method/End Point for getting the User details by entering the Username from the UI.
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	// End point to delete the user
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.userService.deleteUser(userId);
		System.out.println("User with userId "+ userId + " has been deleted from the database.");
	}
	
	
}
