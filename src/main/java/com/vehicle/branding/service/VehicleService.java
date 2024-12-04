package com.vehicle.branding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.branding.entity.Vehicle;
import com.vehicle.branding.respository.VehicleRepository;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle registerVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getvehicleByUserId(Integer userId){
        return vehicleRepository.findByUserId(userId);
    }

    
    
}
