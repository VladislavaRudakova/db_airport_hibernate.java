package com.airport.service;

import com.airport.model.dao.LocationCountryDao;
import com.airport.model.dao.impl.LocationCountryDaoImpl;
import com.airport.model.entity.LocationCountry;

public class LocationCountryService {

    public String countryToString(LocationCountry locationCountry) {
        return locationCountry.getId() + " " + locationCountry.getName();
    }

    public void createCountry(String name) {
        LocationCountry locationCountry = new LocationCountry();
        LocationCountryDao locationCountryDao = new LocationCountryDaoImpl();
        locationCountry.setName(name);
        locationCountryDao.save(locationCountry);

    }


}
