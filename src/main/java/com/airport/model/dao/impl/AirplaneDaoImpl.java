package com.airport.model.dao.impl;

import com.airport.model.dao.AirplaneDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Airplane;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class AirplaneDaoImpl extends DefaultDaoImpl<Airplane> implements AirplaneDao {

    public AirplaneDaoImpl() {
        super(Airplane.class);
    }

    @Override
    public List<Airplane> findByName(String name) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Airplane where name = :name");
        query.setParameter("name", name);

        return query.getResultList();
    }

    @Override
    public void updateAll(Airplane airplane) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update Airplane set name = : name, passengerCapacity = :capacity where id = :id");
        query.setParameter("name", airplane.getName());
        query.setParameter("capacity", airplane.getPassengerCapacity());
        query.setParameter("id", airplane.getId());
        query.executeUpdate();
        entityManager.getTransaction().commit();
    }
}
