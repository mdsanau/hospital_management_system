package com.hospital_management.repositories;

import com.hospital_management.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,  Long> {
}
