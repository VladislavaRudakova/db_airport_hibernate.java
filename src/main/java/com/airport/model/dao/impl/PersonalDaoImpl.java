package com.airport.model.dao.impl;

import com.airport.model.dao.PersonalDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Personal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class PersonalDaoImpl extends DefaultDaoImpl<Personal> implements PersonalDao {

    public PersonalDaoImpl() {
        super(Personal.class);
    }

    @Override
    public List<Personal> findByName(String name) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Personal where name = :name");
        query.setParameter("name", name);
        return query.getResultList();
    }


}
