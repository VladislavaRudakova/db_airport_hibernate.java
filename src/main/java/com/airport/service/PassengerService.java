package com.airport.service;

import com.airport.model.dao.TicketDao;
import com.airport.model.dao.impl.TicketDaoImpl;
import com.airport.model.entity.Passenger;
import com.airport.model.entity.Ticket;
import com.airport.model.entity.User;

import java.util.List;

public class PassengerService {

    private String ticketsToString(List<Ticket> tickets, TicketService ticketService) {
        String ticketStr = "\n";
        for (Ticket ticket : tickets) {
            ticketStr += ticketService.ticketToString(ticket) + "\n";

        }
        return ticketStr;
    }

    public String passengerToString(Passenger passenger, TicketService ticketService) {
        return passenger.getId() + " " + passenger.getName() + " " + passenger.getSurname() + " passport: " +
               passenger.getPassportNumber() + " e_mail: " + passenger.getEMail() + ticketsToString(passenger.getTickets(), ticketService);
    }

    public void createPassenger(String name, String surname, Integer passport, String eMail, Integer userId, Integer ticketId) {

        TicketDao ticketDao = new TicketDaoImpl();
        Ticket ticket = new Ticket();

        Passenger passenger = Passenger.builder()
                .name(name)
                .surname(surname)
                .passportNumber(passport)
                .eMail(eMail)
                .build();

        if (userId != null) {
            User user = new User();
            user.setId(userId);
            passenger.setUser(user);
        }

        ticket = ticketDao.findById(ticket, ticketId);
        ticket.setPassenger(passenger);
        ticketDao.merge(ticket);

    }


}
