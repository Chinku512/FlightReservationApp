package com.example.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flight.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailId);



}
