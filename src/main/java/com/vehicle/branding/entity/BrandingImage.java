package com.vehicle.branding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BrandingImage {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer imageId;

    private String imageURL;

    private String imageStatus;

    private String comments;
    

    @ManyToOne
    @JoinColumn(name = "vehicleId")
    private Vehicle vehicle;

}
