package com.airport.service;

import com.airport.model.dao.PersonalDao;
import com.airport.model.dao.impl.PersonalDaoImpl;
import com.airport.model.entity.Flight;
import com.airport.model.entity.JobTitle;
import com.airport.model.entity.Personal;

import java.util.List;

public class PersonalService {

    public String jobTitlesToString(List<JobTitle> jobTitles) {
        String job = "";
        for (JobTitle jobTitle : jobTitles) {
            job += jobTitle.getTitle() + " " + jobTitle.getDepartment().getName() + " ";
        }
        return job;
    }

    public String flightsToString(List<Flight> flights) {
        String flightStr = "";
        for (Flight flight : flights) {
            flightStr += flight.getId() + " ";
        }
        return flightStr;
    }

    public String personalToString(Personal personal) {
        return personal.getId() + " " + personal.getName() + " " + personal.getSurname() + " JOB TITLES: " +
               jobTitlesToString(personal.getJobTitles()) + " FLIGHTS: " + flightsToString(personal.getFlights());
    }

    public void createPersonal(String name, String surname) {
        PersonalDao personalDao = new PersonalDaoImpl();
        Personal personal = Personal.builder()
                .name(name)
                .surname(surname)
                .build();

        personalDao.save(personal);

    }

}
