package com.airport.model.dao;

import com.airport.model.entity.Passenger;

import java.util.List;

public interface PassengerDao extends DefaultDao<Passenger> {

    List<Passenger> findBySurname(String name);

}
