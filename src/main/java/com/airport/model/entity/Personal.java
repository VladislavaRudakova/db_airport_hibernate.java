package com.airport.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    @ManyToMany
    @JoinTable(name = "personal_job_title", joinColumns = {@JoinColumn(name = "personal_id")},
            inverseJoinColumns = {@JoinColumn(name = "job_title_id")})
    private List<JobTitle> jobTitles;
    @ManyToMany
    @JoinTable(name = "personal_job_title", joinColumns = {@JoinColumn(name = "personal_id")},
            inverseJoinColumns = {@JoinColumn(name = "flight_id")})
    List<Flight> flights;

}

