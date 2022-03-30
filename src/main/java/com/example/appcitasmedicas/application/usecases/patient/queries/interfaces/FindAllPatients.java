package com.example.appcitasmedicas.application.usecases.patient.queries.interfaces;

import com.example.appcitasmedicas.domain.dtos.PatientDTO;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface FindAllPatients {
    Flux<PatientDTO> findAllPatients();
}
