package com.airport.model.dao;

import com.airport.model.entity.LocationCountry;

import java.util.List;

public interface LocationCountryDao extends DefaultDao<LocationCountry> {
    public List<LocationCountry> findByName(String name);

}
