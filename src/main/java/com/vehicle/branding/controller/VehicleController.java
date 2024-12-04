package com.vehicle.branding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.branding.entity.Vehicle;
import com.vehicle.branding.respository.VehicleRepository;
import com.vehicle.branding.service.VehicleService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    @PostMapping("/add")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle ) {
         Vehicle addedVehicle = vehicleService.registerVehicle(vehicle);
        
        return new ResponseEntity<>(addedVehicle, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Vehicle>>  getvehicleByUserId(@PathVariable Integer userId) {

        List<Vehicle> vehicleList =vehicleService.getvehicleByUserId(userId);
        return new ResponseEntity<>(vehicleList, HttpStatus.OK);
         
    }
    
    
    
}
