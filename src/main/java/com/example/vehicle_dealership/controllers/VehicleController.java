package com.example.vehicle_dealership.controllers;

import com.example.vehicle_dealership.entities.Vehicle;
import com.example.vehicle_dealership.services.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    private VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    //post create vehicle
    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@ResponseBody @Valid Vehicle vehicle){
        Vehicle newVehicle = this.vehicleService.create(vehicle);

        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }
    //get all vehicles
    //put update vehicle
    //delete by id
    //get by id
    //get by price
    //get by make
    //get by model
    //get by year
    //get by color
    //get by miles
    //get by type
    //get by dealership id
}
