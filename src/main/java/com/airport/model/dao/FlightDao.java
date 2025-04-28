package com.airport.model.dao;


import com.airport.model.entity.Flight;

import java.util.List;

public interface FlightDao extends DefaultDao<Flight> {

    List<Flight> findByDepArrCity(String depCity, String arrCity);

}
