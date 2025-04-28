package com.airport.service;

import com.airport.model.dao.AirplaneDao;
import com.airport.model.dao.impl.AirplaneDaoImpl;
import com.airport.model.entity.Airplane;

public class AirplaneService {

    public String airplaneToString(Airplane airplane) {
        return airplane.getId() + " " + airplane.getName() + " passenger capacity: " + airplane.getPassengerCapacity();
    }

    public void createAirplane(String name, Integer passengerCapacity) {
        AirplaneDao airplaneDao = new AirplaneDaoImpl();
        Airplane airplane = new Airplane();
        airplane.setName(name);
        airplane.setPassengerCapacity(passengerCapacity);
        airplaneDao.save(airplane);
    }

}
