package com.airport.model.dao;

import com.airport.model.entity.Route;

import java.util.List;

public interface RouteDao extends DefaultDao<Route> {
    List<Route> findByDepArrCity(String depCity, String arrCity);

}
