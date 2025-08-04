package com.hospital_management.services;


import com.hospital_management.dtos.PatientDTO;
import com.hospital_management.entities.Patient;
import java.util.List;

public interface PatientService {
    PatientDTO createPatient(PatientDTO patientDTO);
    List<PatientDTO> getAllPatients();
    PatientDTO getPatientById(Long id);

}

