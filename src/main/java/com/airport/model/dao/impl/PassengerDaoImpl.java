package com.airport.model.dao.impl;

import com.airport.model.dao.PassengerDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Passenger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class PassengerDaoImpl extends DefaultDaoImpl<Passenger> implements PassengerDao {

    public PassengerDaoImpl() {
        super(Passenger.class);
    }

    @Override
    public List<Passenger> findBySurname(String surname) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Passenger where surname = :surname");
        query.setParameter("surname", surname);

        return query.getResultList();
    }
}
