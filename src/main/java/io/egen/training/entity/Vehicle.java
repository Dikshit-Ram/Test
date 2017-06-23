package io.egen.training.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by diksh on 6/23/2017.
 */
public class Vehicle {
    private String vin;
    private String make;
    private String model;
    private short year;
    private short redLineRpm;
    private float maxFuelVolume;
    private Date lastServiceDate;
    private List<VehicleReading> vehicleReadings;
}
