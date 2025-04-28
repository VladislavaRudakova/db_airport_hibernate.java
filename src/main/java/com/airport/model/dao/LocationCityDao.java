package com.airport.model.dao;

import com.airport.model.entity.LocationCity;

import java.util.List;

public interface LocationCityDao extends DefaultDao<LocationCity> {
    List<LocationCity> findByName(String name);

}
