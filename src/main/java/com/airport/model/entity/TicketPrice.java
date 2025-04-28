package com.airport.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "ticket_price")
public class TicketPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
    @OneToOne
    @JoinColumn(name = "ticket_class_id")
    private TicketClass ticketClass;
    @Column(name = "ticket_price")
    private Double ticketPrice;
}
