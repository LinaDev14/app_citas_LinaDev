package com.example.appcitasmedicas.application.mappers;

import com.example.appcitasmedicas.domain.collections.Appointment;
import com.example.appcitasmedicas.domain.dtos.AppointmentDTO;
import com.example.appcitasmedicas.domain.valueObjects.AppointmentDetails;
import com.example.appcitasmedicas.domain.valueObjects.AppointmentStatus;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AppointmentMapper {

    public Function<Appointment, AppointmentDTO> mapToDTO(){
        return appointment -> new AppointmentDTO(appointment.getId(),
                appointment.getPatientId(),
                appointment.getDoctorId(),
                appointment.getAppointmentDetails());
    }

    public Function<AppointmentDTO, Appointment> mapToCollection(){
        return appointmentDTO -> new Appointment(appointmentDTO.getId(),
                appointmentDTO.getPatientId(),
                appointmentDTO.getDoctorId(),
                appointmentDTO.getAppointmentDetails());
    }

    public Function<AppointmentDTO, Appointment> mapToCancelledCollection(){
        return appointmentDTO -> new Appointment(appointmentDTO.getId(),
                appointmentDTO.getPatientId(),
                appointmentDTO.getDoctorId(),
                new AppointmentDetails(appointmentDTO.getAppointmentDetails().getDate(),
                        AppointmentStatus.CANCELLED,
                        appointmentDTO.getAppointmentDetails().getTriage()));
    }
}
