package com.hospital_management.services.impl;

import com.hospital_management.dtos.PatientDTO;
import com.hospital_management.entities.Patient;
import com.hospital_management.mapper.PatientMapper;
import com.hospital_management.repositories.PatientRepository;
import com.hospital_management.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = PatientMapper.toEntity(patientDTO);
        return PatientMapper.toDTO(patientRepository.save(patient));
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(PatientMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PatientDTO getPatientById(Long id) {
        Patient patient = patientRepository.findById(id).orElse(null);
        return patient != null ? PatientMapper.toDTO(patient) : null;
    }
}