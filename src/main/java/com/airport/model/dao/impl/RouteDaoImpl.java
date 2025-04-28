package com.airport.model.dao.impl;

import com.airport.model.dao.RouteDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Route;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class RouteDaoImpl extends DefaultDaoImpl<Route> implements RouteDao {

    public RouteDaoImpl() {
        super(Route.class);
    }

    @Override
    public List<Route> findByDepArrCity(String depCity, String arrCity) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Route where departureCity.name = :depCity and arrivalCity.name = :arrCity");
        query.setParameter("depCity", depCity);
        query.setParameter("arrCity", arrCity);

        return query.getResultList();
    }
}
