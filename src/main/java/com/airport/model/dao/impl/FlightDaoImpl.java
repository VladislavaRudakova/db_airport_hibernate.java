package com.airport.model.dao.impl;

import com.airport.model.dao.FlightDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Flight;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class FlightDaoImpl extends DefaultDaoImpl<Flight> implements FlightDao {
    public FlightDaoImpl() {
        super(Flight.class);
    }

    @Override
    public List<Flight> findByDepArrCity(String depCity, String arrCity) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Flight where route.departureCity = :depCity and route.arrivalCity = :arrCity");
        query.setParameter("depCity", depCity);
        query.setParameter("arrCity", arrCity);
        return query.getResultList();
    }
}
