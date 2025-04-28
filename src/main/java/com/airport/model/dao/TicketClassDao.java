package com.airport.model.dao;

import com.airport.model.entity.TicketClass;

import java.util.List;

public interface TicketClassDao extends DefaultDao<TicketClass> {
    List<TicketClass> findByName(String name);

}
