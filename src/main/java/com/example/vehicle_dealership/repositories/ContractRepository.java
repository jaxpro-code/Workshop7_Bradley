package com.example.vehicle_dealership.repositories;

import com.example.vehicle_dealership.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
