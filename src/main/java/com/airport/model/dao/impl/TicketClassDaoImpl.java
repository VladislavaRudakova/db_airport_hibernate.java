package com.airport.model.dao.impl;

import com.airport.model.dao.TicketClassDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Ticket;
import com.airport.model.entity.TicketClass;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class TicketClassDaoImpl extends DefaultDaoImpl<TicketClass> implements TicketClassDao {

    public TicketClassDaoImpl() {
        super(TicketClass.class);
    }

    @Override
    public List<TicketClass> findByName(String name) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from TicketClass where name = :name");
        query.setParameter("name", name);

        return query.getResultList();
    }
}
