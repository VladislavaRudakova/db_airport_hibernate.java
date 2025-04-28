package com.airport.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "location_city")
public class LocationCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private LocationCountry locationCountry;
}
