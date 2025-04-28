package com.airport.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "personal_job_title")
public class PersonalJobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @OneToOne
    @JoinColumn(name = "personal_id")
    Personal personal;
    @OneToOne
    @JoinColumn(name = "job_title_id")
    JobTitle jobTitle;
    @OneToOne
    @JoinColumn(name = "flight_id")
    Flight flight;

}
