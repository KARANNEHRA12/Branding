package com.vehicle.branding.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer userId;

    private String userName;
    
    private String userType;

    private String role;


    @OneToMany(mappedBy = "user")
    private List<Vehicle> vehicles;



    
}
