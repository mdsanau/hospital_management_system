package com.hospital_management.services;

import com.hospital_management.dtos.AppointmentDTO;
import com.hospital_management.entities.Appointment;

import java.util.List;

public interface AppointmentService {
    AppointmentDTO createAppointment(AppointmentDTO dto);
    List<AppointmentDTO> getAllAppointments();
}

