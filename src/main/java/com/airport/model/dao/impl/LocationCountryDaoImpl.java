package com.airport.model.dao.impl;

import com.airport.model.dao.LocationCountryDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.LocationCountry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class LocationCountryDaoImpl extends DefaultDaoImpl<LocationCountry> implements LocationCountryDao {

    public LocationCountryDaoImpl() {
        super(LocationCountry.class);
    }


    public List<LocationCountry> findByName(String name) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from LocationCountry where name = :name");
        query.setParameter("name", name);

        return query.getResultList();
    }


}
