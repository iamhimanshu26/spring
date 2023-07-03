package com.exam.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration  // To tell the spring that this class will have all the required configs 
@EnableWebSecurity(debug = true)   
@EnableMethodSecurity
public class MySecurityConfig {
	
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	
//	@Autowired
//	private UserDetailsServiceImpl userDetailServiceImpl;
	
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.builder().username("iamhimanshu").
				                   password(passwordEncoder().encode("mypassword")).roles("ADMIN").build();
		UserDetails user1 = User.builder().username("sujeet12").
                password(passwordEncoder().encode("12345")).roles("NORMAL").build();
		UserDetails user2 = User.builder().username("raman12").
                password(passwordEncoder().encode("raman")).roles("NORMAL").build();
		return new InMemoryUserDetailsManager(user,user1,user2);  // Can pass many details 
	}
	
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
	    return builder.getAuthenticationManager();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder() ;
	}
//
//	@Bean
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.userDetailsService(this.userDetailServiceImpl).passwordEncoder(passwordEncoder());
//	}
	
//
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf(csrf -> csrf.disable())
		.cors(cors -> cors.disable())
        .authorizeHttpRequests(auth -> auth.requestMatchers("/user/**")
        		                .authenticated().requestMatchers("/auth/login").permitAll()
        	                    .anyRequest().authenticated())
        .exceptionHandling(ex -> ex.authenticationEntryPoint(jwtAuthenticationEntryPoint))
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
 	        
	     // Add a filter to validate the tokens with every request
	     http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
	        return http.build();
	    }

}
