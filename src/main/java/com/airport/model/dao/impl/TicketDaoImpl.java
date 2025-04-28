package com.airport.model.dao.impl;

import com.airport.model.dao.TicketDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class TicketDaoImpl extends DefaultDaoImpl<Ticket> implements TicketDao {

    public TicketDaoImpl() {
        super(Ticket.class);
    }

    public void merge(Ticket ticket) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(ticket);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Ticket> findAvailableTickets() {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Ticket where passenger is null");

        return query.getResultList();
    }

    @Override
    public List<Ticket> findByFlightId(Integer flight) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Ticket where flight.id = :flight");
        query.setParameter("flight", flight);

        return query.getResultList();
    }

    @Override
    public void updatePassenger(Ticket ticket) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update Ticket set passenger = :passengerId where id = :id");
        query.setParameter("passengerId", ticket.getPassenger());
        query.setParameter("id", ticket.getId());

        query.executeUpdate();
        entityManager.getTransaction().commit();
    }


}
