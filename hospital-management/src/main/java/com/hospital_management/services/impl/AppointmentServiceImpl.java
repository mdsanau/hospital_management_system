package com.hospital_management.services.impl;

import com.hospital_management.dtos.AppointmentDTO;
import com.hospital_management.entities.Appointment;
import com.hospital_management.mapper.AppointmentMapper;
import com.hospital_management.repositories.AppointmentRepository;
import com.hospital_management.repositories.DoctorRepository;
import com.hospital_management.repositories.PatientRepository;
import com.hospital_management.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public AppointmentDTO createAppointment(AppointmentDTO dto) {
        Appointment appointment = AppointmentMapper.toEntity(dto);

        doctorRepository.findById(dto.getDoctorId()).ifPresent(appointment::setDoctor);
        patientRepository.findById(dto.getPatientId()).ifPresent(appointment::setPatient);

        return AppointmentMapper.toDTO(appointmentRepository.save(appointment));
    }

    @Override
    public List<AppointmentDTO> getAllAppointments() {
        return appointmentRepository.findAll()
                .stream()
                .map(AppointmentMapper::toDTO)
                .collect(Collectors.toList());
    }
}
