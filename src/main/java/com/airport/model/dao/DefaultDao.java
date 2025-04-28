package com.airport.model.dao;

import java.util.List;

public interface DefaultDao<T> {

    void save(T entity);

    List<T> findAll(T entity);

    T findById(T entity, Integer id);


    void delete(T entity);


}
