package io.egen.training.controller;

import io.egen.training.controller.AlertsController;
import io.egen.training.entity.Alerts;
import io.egen.training.entity.Vehicle;
import io.egen.training.entity.VehicleReading;
import io.egen.training.service.AlertsService;
import org.junit.*;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
/*
* Mocks and tests create Alerts with Mockito
* */
public class AlertsControllerTest {
    private AlertsController alertsController;
    private AlertsService alertsService;
    private Alerts alertsSuccess;
    private Alerts alertsFail;
    @Before
    public void setUp() {
        alertsController = new AlertsController(alertsService);
        alertsService = Mockito.mock(AlertsService.class);
        alertsSuccess = new Alerts();
        alertsSuccess.setAlertId("testID");
        alertsFail = new Alerts();
        alertsFail.setAlertId("test");
    }
    @Mock
    Vehicle vehicle;
    @Mock
    VehicleReading vehicleReading;
    @Test
    public void testAlertsSuccess() {
        Mockito.when(alertsService.createAlerts(vehicle, vehicleReading)).thenReturn(alertsSuccess);
        Assert.assertEquals(alertsService.createAlerts(vehicle, vehicleReading), alertsSuccess );
        Mockito.verify(alertsService).createAlerts(vehicle, vehicleReading);
    }
    @Test
    public void testAlertsFail() {
        Mockito.when(alertsService.createAlerts(vehicle, vehicleReading)).thenReturn(alertsSuccess);
        Assert.assertEquals(alertsService.createAlerts(vehicle, vehicleReading), alertsFail );
        Mockito.verify(alertsService).createAlerts(vehicle, vehicleReading);
    }
}