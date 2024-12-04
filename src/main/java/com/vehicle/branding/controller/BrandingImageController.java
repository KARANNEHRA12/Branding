package com.vehicle.branding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vehicle.branding.entity.BrandingImage;
import com.vehicle.branding.service.BrandingImageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class BrandingImageController {

    @Autowired
    private BrandingImageService brandingImageService;


    @PostMapping("/upload")
    public ResponseEntity<List<BrandingImage>>   uploadImage(@RequestParam("vehicleId") Integer vehicleId, @RequestParam("files") MultipartFile[] files) {
         List<BrandingImage> uploadedImage = brandingImageService.uploadBrandingImage(vehicleId, files);

         return new ResponseEntity<>(uploadedImage, HttpStatus.OK);

    }

    @GetMapping("/vehicle/{vehicleId}")
    public ResponseEntity<List<BrandingImage>> getImageByVehicleId(@PathVariable Integer vehicleId) {
        List<BrandingImage> images = brandingImageService.getImageByVehicleId(vehicleId);

        return new ResponseEntity<>(images, HttpStatus.OK);
        
    }
    
    
    
}
