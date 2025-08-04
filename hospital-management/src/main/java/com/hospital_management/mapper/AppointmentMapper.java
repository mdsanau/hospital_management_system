package com.hospital_management.mapper;

import com.hospital_management.dtos.AppointmentDTO;
import com.hospital_management.entities.Appointment;

public class AppointmentMapper {

    public static Appointment toEntity(AppointmentDTO dto) {
        Appointment a = new Appointment();
        a.setId(dto.getId());
        a.setAppointmentDate(dto.getAppointmentDate());
        a.setReason(dto.getReason());
        // set doctor and patient manually in service
        return a;
    }

    public static AppointmentDTO toDTO(Appointment entity) {
        AppointmentDTO dto = new AppointmentDTO();
        dto.setId(entity.getId());
        dto.setAppointmentDate(entity.getAppointmentDate());
        dto.setReason(entity.getReason());
        dto.setDoctorId(entity.getDoctor() != null ? entity.getDoctor().getId() : null);
        dto.setPatientId(entity.getPatient() != null ? entity.getPatient().getId() : null);
        return dto;
    }
}
