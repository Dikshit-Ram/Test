package io.egen.training.entity;

/**
 * Created by diksh on 6/23/2017.
 */
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
