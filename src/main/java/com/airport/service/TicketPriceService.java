package com.airport.service;

import com.airport.model.dao.TicketPriceDao;
import com.airport.model.dao.impl.TicketPriceDaoImpl;
import com.airport.model.entity.Flight;
import com.airport.model.entity.TicketClass;
import com.airport.model.entity.TicketPrice;

public class TicketPriceService {

    public void createTicketPrice(Integer flightId, Integer classId, Double price) {
        TicketPriceDao ticketPriceDao = new TicketPriceDaoImpl();
        TicketPrice ticketPrice = new TicketPrice();
        Flight flight = new Flight();
        TicketClass ticketClass = new TicketClass();
        ticketClass.setId(classId);
        flight.setId(flightId);
        ticketPrice.setFlight(flight);
        ticketPrice.setTicketClass(ticketClass);
        ticketPrice.setTicketPrice(price);
        ticketPriceDao.save(ticketPrice);

    }


}
