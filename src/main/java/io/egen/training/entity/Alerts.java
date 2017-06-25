package io.egen.training.entity;

import lombok.Data;

@Data
public class Alerts {
    private enum Alert{
        HIGH, MEDIUM, LOW
    }

    private Alert engineRpmAlert;
    private Alert fuelVolumeAlert;
    private Alert tirePressureAlert;
    private Alert engineCoolantAlert;
    private Alert checkEngineLightOnAlert;
   
}
