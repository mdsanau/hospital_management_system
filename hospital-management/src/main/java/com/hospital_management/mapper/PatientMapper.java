package com.hospital_management.mapper;

import com.hospital_management.dtos.PatientDTO;
import com.hospital_management.entities.Patient;

public class PatientMapper {

    public static Patient toEntity(PatientDTO dto) {
        Patient p = new Patient();
        p.setName(dto.getName());
        p.setEmail(dto.getEmail());
        p.setAge(dto.getAge());
        p.setGender(dto.getGender());
        return p;
    }

    public static PatientDTO toDTO(Patient entity) {
        PatientDTO dto = new PatientDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setAge(entity.getAge());
        dto.setGender(entity.getGender());
        return dto;
    }
}
