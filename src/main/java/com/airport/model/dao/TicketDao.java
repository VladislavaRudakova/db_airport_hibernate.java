package com.airport.model.dao;


import com.airport.model.entity.Ticket;

import java.util.List;

public interface TicketDao extends DefaultDao<Ticket> {

    List<Ticket> findByFlightId(Integer flight);

    void updatePassenger(Ticket ticket);

    void merge(Ticket ticket);

    List<Ticket> findAvailableTickets();


}
