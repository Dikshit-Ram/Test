package io.egen.training.service;

import io.egen.training.ExceptionHandling.ErrorResponse;
import io.egen.training.entity.Alerts;
import io.egen.training.entity.Vehicle;
import io.egen.training.entity.VehicleReading;
import io.egen.training.repository.AlertsRepository;
import io.egen.training.repository.VehicleReadingRepository;
import io.egen.training.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Transactional
    public ResponseEntity<Vehicle> save(Vehicle vehicle){
        if(vehicle==null){
            throw new ErrorResponse(HttpStatus.NOT_FOUND, "Vehicle is null");
        }
        Vehicle vehicle1 = vehicleRepository.save(vehicle);
        return new ResponseEntity<>(vehicle1, HttpStatus.OK);
    }

    @Transactional
    public List<Vehicle> saveVehicles(List<Vehicle> vehicleList) {
        if(vehicleList.isEmpty()){
            //error
        }
        List<Vehicle> vehicleList1 = vehicleRepository.save(vehicleList);
        return vehicleList1;
    }

    @Transactional
    public List<Vehicle> findAllVehicles() {
        List<Vehicle> vehicleList1 = vehicleRepository.findAll();
        return vehicleList1;
    }

    @Transactional
    public Vehicle findOneVehicle(String vin) {
        Vehicle vehicle = vehicleRepository.findOne(vin);
        if(vehicle == null){
            //error
        }
        return vehicle;
    }

    @Transactional
    public void deleteVehicle(Vehicle vehicle) {
        if(vehicle == null){
            //error
        }
        vehicleRepository.delete(vehicle);
    }
}
