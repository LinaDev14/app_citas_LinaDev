package com.example.appcitasmedicas.domain.repositories;

import com.example.appcitasmedicas.domain.collections.Patient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends ReactiveMongoRepository<Patient, String> {
}
