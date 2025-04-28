package com.airport;


import com.airport.model.dao.*;
import com.airport.model.dao.impl.*;
import com.airport.model.entity.*;
import com.airport.service.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Main {

    static void personal() {
        System.out.println("*PERSONAL*");
        PersonalDao personalDao = new PersonalDaoImpl();
        PersonalService personalService = new PersonalService();
        List<Personal> personalList = personalDao.findAll(new Personal());
        for (Personal personal : personalList) {
            System.out.println(personalService.personalToString(personal));
        }
    }

    static void department() {
        System.out.println("*DEPARTMENTS*");
        DepartmentDao departmentDao = new DepartmentDaoImpl();
        DepartmentService departmentService = new DepartmentService();
        List<Department> departments = departmentDao.findAll(new Department());
        for (Department department : departments) {
            System.out.println(departmentService.departmentToString(department));
        }
    }

    static void jobTitles() {
        System.out.println("*JOB TITLES*");
        JobTitleDao jobTitleDao = new JobTitleDaoImpl();
        JobTitleService jobTitleService = new JobTitleService();
        List<JobTitle> jobTitles = jobTitleDao.findAll(new JobTitle());
        for (JobTitle jobTitle : jobTitles) {
            System.out.println(jobTitleService.jobTitleToString(jobTitle));
        }
    }

    static void cities() {
        System.out.println("*CITIES*");
        LocationCityDao locationCityDao = new LocationCityDaoImpl();
        LocationCityService locationCityService = new LocationCityService();
        List<LocationCity> cities = locationCityDao.findAll(new LocationCity());
        for (LocationCity locationCity : cities) {
            System.out.println(locationCityService.cityToString(locationCity));
        }
    }

    static void routes() {
        System.out.println("*ROUTES*");
        RouteDao routeDao = new RouteDaoImpl();
        RouteService routeService = new RouteService();
        List<Route> routes = routeDao.findAll(new Route());
        for (Route route : routes) {
            System.out.println(routeService.routeToString(route));
        }
    }

    static void flights() {
        System.out.println("*FLIGHTS*");
        FlightDao flightDao = new FlightDaoImpl();
        FlightService flightService = new FlightService();
        List<Flight> flightList = flightDao.findAll(new Flight());
        for (Flight flight : flightList) {
            System.out.println(flightService.flightToString(flight));
        }
    }

    static void tickets() {
        System.out.println("*TICKETS*");
        TicketDao ticketDao = new TicketDaoImpl();
        TicketService ticketService = new TicketService();
        List<Ticket> tickets = ticketDao.findAvailableTickets();
        for (Ticket ticket : tickets) {
            System.out.println(ticketService.ticketToString(ticket));
        }
    }

    static void users() {
        System.out.println("*USERS*");
        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserService();
        List<User> users = userDao.findAll(new User());
        for (User user : users) {
            System.out.println(userService.userToString(user));
        }
    }

    static void passengers() {
        System.out.println("*PASSENGERS*");
        PassengerDao passengerDao = new PassengerDaoImpl();
        PassengerService passengerService = new PassengerService();
        TicketService ticketService = new TicketService();
        List<Passenger> passengers = passengerDao.findAll(new Passenger());
        for (Passenger passenger : passengers) {
            System.out.println(passengerService.passengerToString(passenger, ticketService));
        }
    }


    static void fillDepartment() {
        DepartmentService departmentService = new DepartmentService();
        departmentService.createDepartment("administration");
        departmentService.createDepartment("flight crew");
        departmentService.createDepartment("dispatchers");
    }


    static void fillJobTitle() {
        JobTitleService jobTitleService = new JobTitleService();

        jobTitleService.createJobTitle("director", 1);
        jobTitleService.createJobTitle("pilot", 2);
        jobTitleService.createJobTitle("dispatcher", 3);
    }


    static void fillPersonal() {
        PersonalService personalService = new PersonalService();
        personalService.createPersonal("Oleg", "K");
    }

    static void fillPersonalJobTitle() {
        PersonalJobTitleService personalJobTitleService = new PersonalJobTitleService();
        personalJobTitleService.createPersonalJobTitle(1, 1, null);
        personalJobTitleService.createPersonalJobTitle(1, 2, 1);

    }

    static void fillAirplane() {
        AirplaneService airplaneService = new AirplaneService();
        airplaneService.createAirplane("Concorde", 150);
        airplaneService.createAirplane("Tu-150", 150);
        airplaneService.createAirplane("Boeing", 170);
        airplaneService.createAirplane("British Aerospace", 170);

    }


    static void fillCountry() {
        LocationCountryService locationCountryService = new LocationCountryService();
        locationCountryService.createCountry("Belarus");
        locationCountryService.createCountry("France");
        locationCountryService.createCountry("India");
        locationCountryService.createCountry("Australia");

    }

    static void fillTicketClass() {
        TicketClassService ticketClassService = new TicketClassService();
        ticketClassService.createTicketClass("first");
        ticketClassService.createTicketClass("business");
        ticketClassService.createTicketClass("economy");
    }


    static void fillCity() {
        LocationCityService locationCityService = new LocationCityService();
        locationCityService.createCity("Minsk", 1);
        locationCityService.createCity("Nice", 2);
        locationCityService.createCity("Deli", 3);
        locationCityService.createCity("Sydney", 4);
    }

    static void fillRoute() {
        RouteService routeService = new RouteService();
        routeService.createRoute(1, 2);
        routeService.createRoute(2, 1);
        routeService.createRoute(1, 3);
        routeService.createRoute(3, 1);
        routeService.createRoute(1, 4);
        routeService.createRoute(4, 1);
    }


    static void fillFlight() {
        FlightService flightService = new FlightService();
        flightService.createFlight(1, 1, Date.valueOf("2025-04-25"), Time.valueOf("11:00:00"), Time.valueOf("18:00:00"));
        flightService.createFlight(1, 2, Date.valueOf("2025-04-30"), Time.valueOf("12:45:00"), Time.valueOf("19:30:00"));
        flightService.createFlight(2, 3, Date.valueOf("2025-04-24"), Time.valueOf("10:20:00"), Time.valueOf("14:00:00"));
        flightService.createFlight(2, 4, Date.valueOf("2025-04-26"), Time.valueOf("12:00:00"), Time.valueOf("15:40:00"));

    }

    static void fillTickets() {
        TicketService ticketService = new TicketService();
        ticketService.createTicket(10, 1);
        ticketService.createTicket(25, 3);
        ticketService.createTicket(5, 2);
        ticketService.createTicket(20, 2);
    }

    static void fillTicketPrice() {
        TicketPriceService ticketPriceService = new TicketPriceService();
        ticketPriceService.createTicketPrice(1, 1, 150.0);
        ticketPriceService.createTicketPrice(1, 2, 200.0);
        ticketPriceService.createTicketPrice(2, 2, 200.0);
        ticketPriceService.createTicketPrice(3, 3, 220.0);
        ticketPriceService.createTicketPrice(4, 1, 500.0);
    }


    static void fillPassenger() {
        PassengerService passengerService = new PassengerService();
        passengerService.createPassenger("Marina", "N", 223232, "mail1", 2, 3);
        passengerService.createPassenger("Sergey", "F", 122442, "mail2", null, 4);

    }

    static void fillUser() {
        UserService userService = new UserService();
        userService.createUser("Alexander", "mail", "alex12", "123");
        userService.createUser("Marina", "mail1", "marina20", "123");
        userService.createUser("Anton", "mail3", "anton23", "123");
    }


    public static void main(String[] args) {

        fillDepartment();
        fillJobTitle();
        fillPersonal();
        fillPersonalJobTitle();
        fillAirplane();
        fillCountry();
        fillCity();
        fillRoute();
        fillFlight();
        fillTicketClass();
        fillTicketPrice();
        fillUser();
        fillTickets();
        fillPassenger();

        department();
        jobTitles();
        personal();
        passengers();
        cities();
        routes();
        flights();
        users();
        tickets();

    }
}