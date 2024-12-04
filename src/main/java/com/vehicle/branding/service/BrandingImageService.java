package com.vehicle.branding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vehicle.branding.entity.BrandingImage;
import com.vehicle.branding.entity.Vehicle;
import com.vehicle.branding.respository.BrandingImageRepository;
import com.vehicle.branding.respository.VehicleRepository;

@Service
public class BrandingImageService {

    @Autowired
    private BrandingImageRepository brandingImageRepository;

    @Autowired
    private VehicleRepository vehicleRepository;



    public List<BrandingImage> uploadBrandingImage(Integer vehicleId, MultipartFile[] files){

        Vehicle vehicle = vehicleRepository.findById(vehicleId).orElseThrow(() ->  new RuntimeException("Vehicle not found"));
        
        
        
        List<BrandingImage> uploadedImage = new ArrayList<>();
        for( MultipartFile  file  : files){
            //  BrandingImage image 





        }
        // return brandingImageRepository.save(image);
        return uploadedImage;
    }


    public List<BrandingImage> getImageByVehicleId(Integer vehicleId){
        return brandingImageRepository.findByVehicleId(vehicleId);
    }
    
}
