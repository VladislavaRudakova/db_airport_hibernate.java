package com.airport.service;

import com.airport.model.dao.FlightDao;
import com.airport.model.dao.impl.FlightDaoImpl;
import com.airport.model.entity.Airplane;
import com.airport.model.entity.Flight;
import com.airport.model.entity.Route;

import java.sql.Date;
import java.sql.Time;

public class FlightService {

    public String flightToString(Flight flight) {
        return flight.getId() + " Airplane: " + flight.getAirplane().getName() + " departure city: " + flight.getRoute().getDepartureCity().getName() + " arrival city: " +
               flight.getRoute().getArrivalCity().getName() + " " + flight.getDate() + " " + flight.getDepartureTime() + " " + flight.getArrivalTime();
    }


    public void createFlight(Integer airplaneId, Integer routeId, Date date, Time departureTime, Time arrivalTime) {

        FlightDao flightDao = new FlightDaoImpl();


        Route route = new Route();
        route.setId(routeId);
        Airplane airplane = new Airplane();
        airplane.setId(airplaneId);


        Flight flight = Flight.builder()
                .route(route)
                .airplane(airplane)
                .date(date)
                .departureTime(departureTime)
                .arrivalTime(arrivalTime)
                .build();


        flightDao.save(flight);
    }


}
