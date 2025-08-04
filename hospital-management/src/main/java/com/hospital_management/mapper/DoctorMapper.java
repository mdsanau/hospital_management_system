package com.hospital_management.mapper;

import com.hospital_management.dtos.DoctorDTO;
import com.hospital_management.entities.Doctor;

public class DoctorMapper {

    public static Doctor toEntity(DoctorDTO dto) {
        Doctor d = new Doctor();
        d.setId(dto.getId());
        d.setName(dto.getName());
        d.setSpecialization(dto.getSpecialization());
        // set department manually in service (if needed)
        return d;
    }

    public static DoctorDTO toDTO(Doctor entity) {
        DoctorDTO dto = new DoctorDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSpecialization(entity.getSpecialization());
        dto.setDepartmentId(entity.getDepartment() != null ? entity.getDepartment().getId() : null);
        return dto;
    }
}
