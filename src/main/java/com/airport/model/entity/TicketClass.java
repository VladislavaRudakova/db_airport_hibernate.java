package com.airport.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "ticket_class")

public class TicketClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
