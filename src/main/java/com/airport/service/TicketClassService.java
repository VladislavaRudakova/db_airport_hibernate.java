package com.airport.service;

import com.airport.model.dao.TicketClassDao;
import com.airport.model.dao.impl.TicketClassDaoImpl;
import com.airport.model.entity.TicketClass;

public class TicketClassService {

    public void createTicketClass(String name) {
        TicketClassDao ticketClassDao = new TicketClassDaoImpl();
        TicketClass ticketClass = new TicketClass();
        ticketClass.setName(name);
        ticketClassDao.save(ticketClass);
    }


}
