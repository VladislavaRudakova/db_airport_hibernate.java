package com.airport.model.dao;

import com.airport.model.entity.TicketPrice;

import java.util.List;

public interface TicketPriceDao extends DefaultDao<TicketPrice> {

    List<TicketPrice> findByFlightClass(Integer flightId, Integer classId);
}
