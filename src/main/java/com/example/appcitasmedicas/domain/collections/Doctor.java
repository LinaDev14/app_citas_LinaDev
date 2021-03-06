package com.example.appcitasmedicas.domain.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value="doctors")
public class Doctor {

    @Id
    private final String id;
    private final String firstName;
    private final String lastName;

}
