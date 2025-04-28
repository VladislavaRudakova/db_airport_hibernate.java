package com.airport.service;

import com.airport.model.dao.LocationCityDao;
import com.airport.model.dao.LocationCountryDao;
import com.airport.model.dao.impl.LocationCityDaoImpl;
import com.airport.model.dao.impl.LocationCountryDaoImpl;
import com.airport.model.entity.LocationCity;
import com.airport.model.entity.LocationCountry;

public class LocationCityService {

    public String cityToString(LocationCity locationCity) {
        return locationCity.getId() + " " + locationCity.getName() + " " + locationCity.getLocationCountry().getName();
    }

    public void createCity(String name, Integer countryId) {
        LocationCountry locationCountry = new LocationCountry();
        LocationCountryDao locationCountryDao = new LocationCountryDaoImpl();
        locationCountry = locationCountryDao.findById(locationCountry, countryId);

        LocationCity locationCity = new LocationCity();
        locationCity.setLocationCountry(locationCountry);
        locationCity.setName(name);

        LocationCityDao locationCityDao = new LocationCityDaoImpl();

        locationCityDao.save(locationCity);

    }


}
