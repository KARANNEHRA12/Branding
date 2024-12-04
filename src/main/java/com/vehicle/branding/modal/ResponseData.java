package com.vehicle.branding.modal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseData<T> {

    private T data;

    private String status;

    private String info;
    

    
    
}
