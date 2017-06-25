package io.egen.training.repository;

import io.egen.training.entity.VehicleReading;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by diksh on 6/24/2017.
 */
public interface VehicleReadingRepository extends MongoRepository<VehicleReading, String> {
}
