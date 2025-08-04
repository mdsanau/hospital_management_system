package com.hospital_management.services.impl;

import com.hospital_management.dtos.DoctorDTO;
import com.hospital_management.entities.Doctor;
import com.hospital_management.mapper.DoctorMapper;
import com.hospital_management.repositories.DepartmentRepository;
import com.hospital_management.repositories.DoctorRepository;
import com.hospital_management.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DoctorDTO createDoctor(DoctorDTO dto) {
        Doctor doctor = DoctorMapper.toEntity(dto);

        // Set department from ID
        departmentRepository.findById(dto.getDepartmentId()).ifPresent(doctor::setDepartment);

        return DoctorMapper.toDTO(doctorRepository.save(doctor));
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        return doctorRepository.findAll()
                .stream()
                .map(DoctorMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDTO getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .map(DoctorMapper::toDTO)
                .orElse(null);
    }
}

