package com.airport.model.dao;

import com.airport.model.entity.Personal;

import java.util.List;

public interface PersonalDao extends DefaultDao<Personal> {
    List<Personal> findByName(String name);

}
