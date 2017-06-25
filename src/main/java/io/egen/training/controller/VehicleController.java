package io.egen.training.controller;

import io.egen.training.entity.Vehicle;
import io.egen.training.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.PUT, value = "/vehicles")
    public void updateVehicles(@RequestBody List<Vehicle> vehicleList){
        vehicleService.saveVehicles(vehicleList);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/vehicles")
    public void updateVehicle(@RequestBody Vehicle vehicle){
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleService.saveVehicles(vehicleList);
        
    }

}
