package com.airport.model.dao.impl;

import com.airport.model.dao.PersonalJobTitleDao;
import com.airport.model.entity.PersonalJobTitle;


public class PersonalJobTitleDaoImpl extends DefaultDaoImpl<PersonalJobTitle> implements PersonalJobTitleDao {
    public PersonalJobTitleDaoImpl() {
        super(PersonalJobTitle.class);
    }

}

