package com.vehicle.branding.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.branding.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    Optional<Vehicle> findByVehicleId(Integer id);


    Optional<Vehicle> findByVehicleNumber(String number);


    List<Vehicle> findByUserId(Integer userId);
    

    
}
