package com.airport.service;

import com.airport.model.dao.RouteDao;
import com.airport.model.dao.impl.RouteDaoImpl;
import com.airport.model.entity.LocationCity;
import com.airport.model.entity.Route;

public class RouteService {

    public String routeToString(Route route) {
        return route.getId() + " " + route.getDepartureCity().getName() + " " + route.getArrivalCity().getName();
    }

    public void createRoute(Integer depCityId, Integer arrCityId) {

        RouteDao routeDao = new RouteDaoImpl();
        LocationCity depCity = new LocationCity();
        depCity.setId(depCityId);

        LocationCity arrCity = new LocationCity();
        arrCity.setId(arrCityId);
        Route route = new Route();
        route.setDepartureCity(depCity);
        route.setArrivalCity(arrCity);

        routeDao.save(route);

    }


}
