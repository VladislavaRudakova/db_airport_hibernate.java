package com.airport.model.dao.impl;

import com.airport.model.dao.LocationCityDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.LocationCity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class LocationCityDaoImpl extends DefaultDaoImpl<LocationCity> implements LocationCityDao {

    public LocationCityDaoImpl() {
        super(LocationCity.class);
    }


    @Override
    public List<LocationCity> findByName(String name) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from LocationCity where name = :name");
        query.setParameter("name", name);

        return query.getResultList();
    }
}
