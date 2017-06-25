package com.egen.training.boot.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import io.egen.training.entity.Vehicle;

public interface VehicleRepository extends MongoRepository<Vehicle, String>  {

}
