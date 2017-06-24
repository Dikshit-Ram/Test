package io.egen.training.entity;


import java.util.Date;

public class Alerts {
    private enum Alert{
        HIGH, MEDIUM, LOW
    }

    private String vin;
    private Date timestamp;
    private Alert engineRpmAlert;
    private Alert fuelVolumeAlert;
    private Alert tirePressureAlert;
    private Alert engineCoolantAlert;
    private Alert checkEngineLightOnAlert;
   
}
