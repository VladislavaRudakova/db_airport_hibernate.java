package com.airport.model.dao;

import com.airport.model.entity.Airplane;

import java.util.List;

public interface AirplaneDao extends DefaultDao<Airplane> {
    List<Airplane> findByName(String name);
    void updateAll(Airplane airplane);
}
