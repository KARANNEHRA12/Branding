package com.vehicle.branding.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private String vehicleNumber;


    @OneToMany(mappedBy = "vehicle")
    private List<BrandingImage> brandingImages;



    
}
