package com.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserName(String userName);

}
