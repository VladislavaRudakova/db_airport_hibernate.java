package com.airport.service;

import com.airport.model.dao.PersonalJobTitleDao;
import com.airport.model.dao.impl.PersonalJobTitleDaoImpl;
import com.airport.model.entity.Flight;
import com.airport.model.entity.JobTitle;
import com.airport.model.entity.Personal;
import com.airport.model.entity.PersonalJobTitle;

public class PersonalJobTitleService {

    public void createPersonalJobTitle(Integer personalId, Integer jobTitleId, Integer flightId) {
        PersonalJobTitleDao personalJobTitleDao = new PersonalJobTitleDaoImpl();
        PersonalJobTitle personalJobTitle = new PersonalJobTitle();
        Personal personal = new Personal();
        personal.setId(personalId);
        JobTitle jobTitle = new JobTitle();
        jobTitle.setId(jobTitleId);
        Flight flight = new Flight();
        if (flightId != null) {
            flight.setId(flightId);
            personalJobTitle.setFlight(flight);
        }

        personalJobTitle.setPersonal(personal);
        personalJobTitle.setJobTitle(jobTitle);

        personalJobTitleDao.save(personalJobTitle);
    }
}
