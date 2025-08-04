package com.hospital_management.services;

import com.hospital_management.dtos.DoctorDTO;
import com.hospital_management.entities.Doctor;

import java.util.List;

public interface DoctorService {
    DoctorDTO createDoctor(DoctorDTO dto);
    List<DoctorDTO> getAllDoctors();
    DoctorDTO getDoctorById(Long id);
}

