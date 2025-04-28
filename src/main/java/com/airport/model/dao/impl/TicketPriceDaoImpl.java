package com.airport.model.dao.impl;

import com.airport.model.dao.TicketPriceDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.TicketPrice;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class TicketPriceDaoImpl extends DefaultDaoImpl<TicketPrice> implements TicketPriceDao {

    public TicketPriceDaoImpl() {
        super(TicketPrice.class);
    }


    @Override
    public List<TicketPrice> findByFlightClass(Integer flightId, Integer classId) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from TicketPrice where flight_id = :flight and ticketClass_id = :classId");
        query.setParameter("flightId", flightId);
        query.setParameter("classId", classId);

        return query.getResultList();
    }
}
