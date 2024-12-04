package com.vehicle.branding.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.branding.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByRole(String role);

    
}