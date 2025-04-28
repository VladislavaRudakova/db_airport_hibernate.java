package com.airport.model.dao.impl;

import com.airport.model.dao.DefaultDao;
import com.airport.model.dataSource.DataSource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class DefaultDaoImpl<T> implements DefaultDao<T> {
    private Class<T> type;

    public DefaultDaoImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public void save(T entity) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<T> findAll(T entity) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from " + entity.getClass().getName());
        return query.getResultList();
    }

    @Override
    public T findById(T entity, Integer id) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        return entityManager.find(type, id);
    }

    @Override
    public void delete(T entity) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }
}
