package com.example.vehicle_dealership.controllers;

import com.example.vehicle_dealership.entities.Vehicle;
import com.example.vehicle_dealership.services.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Vehicle> createVehicle(@RequestBody @Valid Vehicle vehicle){
        Vehicle newVehicle = this.vehicleService.create(vehicle);

        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }
    //get all vehicles
    //confirmed
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //put update vehicle
    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody @Valid Movie movie, @PathVariable Long id){
        Movie updatedMovie = this.movieService.update(id,movie);

        if(updatedMovie == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
        }
    }
    //delete by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
        Boolean deleteSuccessful = this.movieService.delete(id);

        if(!deleteSuccessful){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            //successful deletes do not return 200, they return 204 no content
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    //get by id
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by price
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by make
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by model
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by year
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by color
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by miles
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by type
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
    //get by dealership id
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.read();

        return new ResponseEntity<>(vehicles,HttpStatus.OK);
    }
}
