package com.vehicle.branding.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.branding.entity.BrandingImage;

@Repository
public interface BrandingImageRepository extends JpaRepository<BrandingImage, Integer> {

    List<BrandingImage> findByImageId(Integer id);

    List<BrandingImage> findByVehicleId(Integer vehicleId);
    
}
