package com.example.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crm.entity.userRegistration;
@Repository
public interface UserRegistrationRepo extends JpaRepository<userRegistration, Long> {

	userRegistration findByEmail(String email);

	
}
