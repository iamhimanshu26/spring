package com.exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.Model.JwtRequest;
import com.exam.Model.JwtResponse;
import com.exam.config.JwtHelper;

@RestController
@CrossOrigin("*") // This will allow all types of request from the server
@RequestMapping("/auth")
public class AuthenticateController {
	
//	@Qualifier("authenticationManager")
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
//	private UserDetailsServiceImpl userDetailsServiceImpl;
	 private UserDetailsService userDetailsService;
	
//	@Qualifier("jwtHelper")
	@Autowired
	private JwtHelper jwtHelper;
	
	 @PostMapping("/login")
	    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

	        this.doAuthenticate(request.getUsername(), request.getPassword());


	        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
	        String token = this.jwtHelper.generateToken(userDetails);

	        JwtResponse response = JwtResponse.builder()
	                .token(token)
	                .username(userDetails.getUsername()).build();
	        return new ResponseEntity<>(response, HttpStatus.OK);
	    }

	    private void doAuthenticate(String username, String password) {

	        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, password);
	        try {
	        	authenticationManager.authenticate(authentication);


	        } catch (BadCredentialsException e) {
	            throw new BadCredentialsException(" Invalid Username or Password  !!");
	        }

	    }

	    @ExceptionHandler(BadCredentialsException.class)
	    public String exceptionHandler() {
	        return "Credentials Invalid !!";
	    }



}
