package com.hospital_management.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class AppointmentDTO {

    private Long id;

    @NotNull(message = "Patient ID is required")
    private Long patientId;

    @NotNull(message = "Doctor ID is required")
    private Long doctorId;

    @NotNull(message = "Appointment date/time is required")
    private LocalDateTime appointmentDate;

    private String reason;

    // Getters and setters
}
