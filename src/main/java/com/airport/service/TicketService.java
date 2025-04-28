package com.airport.service;

import com.airport.model.dao.TicketDao;
import com.airport.model.dao.impl.TicketDaoImpl;
import com.airport.model.entity.Ticket;
import com.airport.model.entity.TicketPrice;

public class TicketService {

    public String ticketToString(Ticket ticket) {
        return ticket.getId() + " Flight: " + ticket.getTicketPrice().getFlight().getId() + " Place number: " + ticket.getPlaceNumber() + " Class: " + ticket.getTicketPrice().getTicketClass().getName();
    }

    public void createTicket(Integer placeNumber, Integer ticketPriceId) {

        TicketDao ticketDao = new TicketDaoImpl();
        TicketPrice ticketPrice = new TicketPrice();
        ticketPrice.setId(ticketPriceId);

        Ticket ticket = Ticket.builder()
                .ticketPrice(ticketPrice)
                .placeNumber(placeNumber)
                .build();

        ticketDao.save(ticket);

    }


}
