//package com.exam.Impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.exam.Model.User;
//import com.exam.Repository.UserRepository;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService{
//
//	@Autowired
//	private UserRepository userRepo;  // Using this obj to use findByUsername() method
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// This method will return the UserDetails object hence User object since we are using User as an UserDetails.
//		User user = this.userRepo.findByUserName(username); // this will return the User.
//		
//		if(user == null) {
//			System.out.println("User not found");
//			throw new UsernameNotFoundException(" No user found !!");
//		}
//		return user;
//	}
//
//}
