package com.example.vehicle_dealership.repositories;

import com.example.vehicle_dealership.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    //provided crud, create a contract, update a contract, find by id, find all, delete by id, delete contract, check existance

    //by type
    List<Contract> findByContractTypeIgnoreCase(String type);

    //by vin
    List<Contract> findByVehicleVin(String vin);

}
